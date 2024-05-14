package net.nwtg.taleofbiomes;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.nwtg.taleofbiomes.world.features.StructureFeature;
import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModTabs;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModMobEffects;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModMenus;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModFeatures;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlockEntities;

import net.neoforged.neoforge.network.registration.IPayloadRegistrar;
import net.neoforged.neoforge.network.handling.IPlayPayloadHandler;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlerEvent;
import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.util.Tuple;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.FriendlyByteBuf;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;

@Mod("tale_of_biomes")
public class TaleOfBiomesMod {
	public static final Logger LOGGER = LogManager.getLogger(TaleOfBiomesMod.class);
	public static final String MODID = "tale_of_biomes";

	public TaleOfBiomesMod(IEventBus modEventBus) {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		NeoForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::registerNetworking);

		TaleOfBiomesModBlocks.REGISTRY.register(modEventBus);
		TaleOfBiomesModBlockEntities.REGISTRY.register(modEventBus);
		TaleOfBiomesModItems.register(modEventBus);

		TaleOfBiomesModTabs.REGISTRY.register(modEventBus);
		TaleOfBiomesModVariables.ATTACHMENT_TYPES.register(modEventBus);
		TaleOfBiomesModFeatures.REGISTRY.register(modEventBus);
		StructureFeature.REGISTRY.register(modEventBus);

		TaleOfBiomesModMobEffects.REGISTRY.register(modEventBus);

		TaleOfBiomesModMenus.REGISTRY.register(modEventBus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static boolean networkingRegistered = false;
	private static final Map<ResourceLocation, NetworkMessage<?>> MESSAGES = new HashMap<>();

	private record NetworkMessage<T extends CustomPacketPayload>(FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) {
	}

	public static <T extends CustomPacketPayload> void addNetworkMessage(ResourceLocation id, FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) {
		if (networkingRegistered)
			throw new IllegalStateException("Cannot register new network messages after networking has been registered");
		MESSAGES.put(id, new NetworkMessage<>(reader, handler));
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private void registerNetworking(final RegisterPayloadHandlerEvent event) {
		final IPayloadRegistrar registrar = event.registrar(MODID);
		MESSAGES.forEach((id, networkMessage) -> registrar.play(id, ((NetworkMessage) networkMessage).reader(), networkMessage.handler()));
		networkingRegistered = true;
	}

	private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new Tuple<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setB(work.getB() - 1);
				if (work.getB() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getA().run());
			workQueue.removeAll(actions);
		}
	}
}
