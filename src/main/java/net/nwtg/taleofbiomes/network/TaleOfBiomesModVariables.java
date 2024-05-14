package net.nwtg.taleofbiomes.network;

import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.PlayPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TaleOfBiomesModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, TaleOfBiomesMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		TaleOfBiomesMod.addNetworkMessage(SavedDataSyncMessage.ID, SavedDataSyncMessage::new, SavedDataSyncMessage::handleData);
		TaleOfBiomesMod.addNetworkMessage(PlayerVariablesSyncMessage.ID, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handleData);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
			PlayerVariables clone = new PlayerVariables();
			clone.normalSlot0 = original.normalSlot0;
			clone.normalSlot1 = original.normalSlot1;
			clone.normalSlot2 = original.normalSlot2;
			clone.normalSlot3 = original.normalSlot3;
			clone.normalSlot4 = original.normalSlot4;
			clone.normalSlot5 = original.normalSlot5;
			clone.normalSlot6 = original.normalSlot6;
			clone.normalSlot7 = original.normalSlot7;
			clone.normalSlot8 = original.normalSlot8;
			clone.normalSlot9 = original.normalSlot9;
			clone.normalSlot10 = original.normalSlot10;
			clone.normalSlot11 = original.normalSlot11;
			clone.normalSlot12 = original.normalSlot12;
			clone.normalSlot13 = original.normalSlot13;
			clone.normalSlot14 = original.normalSlot14;
			clone.normalSlot15 = original.normalSlot15;
			clone.normalSlot16 = original.normalSlot16;
			clone.normalSlot17 = original.normalSlot17;
			clone.normalSlot18 = original.normalSlot18;
			clone.normalSlot19 = original.normalSlot19;
			clone.normalSlot20 = original.normalSlot20;
			clone.normalSlot21 = original.normalSlot21;
			clone.normalSlot22 = original.normalSlot22;
			clone.normalSlot23 = original.normalSlot23;
			clone.normalSlot24 = original.normalSlot24;
			clone.normalSlot25 = original.normalSlot25;
			clone.normalSlot26 = original.normalSlot26;
			clone.normalSlot27 = original.normalSlot27;
			clone.normalSlot28 = original.normalSlot28;
			clone.normalSlot29 = original.normalSlot29;
			clone.normalSlot30 = original.normalSlot30;
			clone.normalSlot31 = original.normalSlot31;
			clone.normalSlot32 = original.normalSlot32;
			clone.normalSlot33 = original.normalSlot33;
			clone.normalSlot34 = original.normalSlot34;
			clone.normalSlot35 = original.normalSlot35;
			clone.normalSlot36 = original.normalSlot36;
			clone.normalSlot37 = original.normalSlot37;
			clone.normalSlot38 = original.normalSlot38;
			clone.normalSlot39 = original.normalSlot39;
			clone.normalSlot40 = original.normalSlot40;
			clone.eldenmoorSlot0 = original.eldenmoorSlot0;
			clone.eldenmoorSlot1 = original.eldenmoorSlot1;
			clone.eldenmoorSlot2 = original.eldenmoorSlot2;
			clone.eldenmoorSlot3 = original.eldenmoorSlot3;
			clone.eldenmoorSlot4 = original.eldenmoorSlot4;
			clone.eldenmoorSlot5 = original.eldenmoorSlot5;
			clone.eldenmoorSlot6 = original.eldenmoorSlot6;
			clone.eldenmoorSlot7 = original.eldenmoorSlot7;
			clone.eldenmoorSlot8 = original.eldenmoorSlot8;
			clone.eldenmoorSlot9 = original.eldenmoorSlot9;
			clone.eldenmoorSlot10 = original.eldenmoorSlot10;
			clone.eldenmoorSlot11 = original.eldenmoorSlot11;
			clone.eldenmoorSlot12 = original.eldenmoorSlot12;
			clone.eldenmoorSlot13 = original.eldenmoorSlot13;
			clone.eldenmoorSlot14 = original.eldenmoorSlot14;
			clone.eldenmoorSlot15 = original.eldenmoorSlot15;
			clone.eldenmoorSlot16 = original.eldenmoorSlot16;
			clone.eldenmoorSlot17 = original.eldenmoorSlot17;
			clone.eldenmoorSlot18 = original.eldenmoorSlot18;
			clone.eldenmoorSlot19 = original.eldenmoorSlot19;
			clone.eldenmoorSlot20 = original.eldenmoorSlot20;
			clone.eldenmoorSlot21 = original.eldenmoorSlot21;
			clone.eldenmoorSlot22 = original.eldenmoorSlot22;
			clone.eldenmoorSlot23 = original.eldenmoorSlot23;
			clone.eldenmoorSlot24 = original.eldenmoorSlot24;
			clone.eldenmoorSlot25 = original.eldenmoorSlot25;
			clone.eldenmoorSlot26 = original.eldenmoorSlot26;
			clone.eldenmoorSlot27 = original.eldenmoorSlot27;
			clone.eldenmoorSlot28 = original.eldenmoorSlot28;
			clone.eldenmoorSlot29 = original.eldenmoorSlot29;
			clone.eldenmoorSlot30 = original.eldenmoorSlot30;
			clone.eldenmoorSlot31 = original.eldenmoorSlot31;
			clone.eldenmoorSlot32 = original.eldenmoorSlot32;
			clone.eldenmoorSlot33 = original.eldenmoorSlot33;
			clone.eldenmoorSlot34 = original.eldenmoorSlot34;
			clone.eldenmoorSlot35 = original.eldenmoorSlot35;
			clone.eldenmoorSlot36 = original.eldenmoorSlot36;
			clone.eldenmoorSlot37 = original.eldenmoorSlot37;
			clone.eldenmoorSlot38 = original.eldenmoorSlot38;
			clone.eldenmoorSlot39 = original.eldenmoorSlot39;
			clone.eldenmoorSlot40 = original.eldenmoorSlot40;
			clone.isBasicToolTableRecipeBookOpen = original.isBasicToolTableRecipeBookOpen;
			clone.isRecipeHelperOpen = original.isRecipeHelperOpen;
			clone.recipeHelperUpdateTimer = original.recipeHelperUpdateTimer;
			if (!event.isWasDeath()) {
				clone.CanTravelToEldenmoor = original.CanTravelToEldenmoor;
				clone.blockPosX = original.blockPosX;
				clone.blockPosY = original.blockPosY;
				clone.blockPosZ = original.blockPosZ;
				clone.playerSeasonName = original.playerSeasonName;
				clone.clientTemperatureC = original.clientTemperatureC;
				clone.clientTemperatureF = original.clientTemperatureF;
				clone.recipePage = original.recipePage;
			}
			event.getEntity().setData(PLAYER_VARIABLES, clone);
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					PacketDistributor.PLAYER.with(player).send(new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PacketDistributor.PLAYER.with(player).send(new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					PacketDistributor.PLAYER.with(player).send(new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "tale_of_biomes_worldvars";
		public String worldSeasonName = "Spring";
		public double worldSeasonDay = 1.0;
		public double worldMaxSeasonDay = 1.0;
		public double worldSeasonTemperature = 0.0;
		public double worldWindSpeed = 0.0;
		public double worldWindTemperature = 0.0;
		public String worldWindDirection = "East";
		public double worldTemperatureC = 4.0;
		public double worldTemperatureF = 39.2;
		public double worldWeatherTemperature = 4.0;
		public double worldTimeTemperature = 0.0;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			worldSeasonName = nbt.getString("worldSeasonName");
			worldSeasonDay = nbt.getDouble("worldSeasonDay");
			worldMaxSeasonDay = nbt.getDouble("worldMaxSeasonDay");
			worldSeasonTemperature = nbt.getDouble("worldSeasonTemperature");
			worldWindSpeed = nbt.getDouble("worldWindSpeed");
			worldWindTemperature = nbt.getDouble("worldWindTemperature");
			worldWindDirection = nbt.getString("worldWindDirection");
			worldTemperatureC = nbt.getDouble("worldTemperatureC");
			worldTemperatureF = nbt.getDouble("worldTemperatureF");
			worldWeatherTemperature = nbt.getDouble("worldWeatherTemperature");
			worldTimeTemperature = nbt.getDouble("worldTimeTemperature");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putString("worldSeasonName", worldSeasonName);
			nbt.putDouble("worldSeasonDay", worldSeasonDay);
			nbt.putDouble("worldMaxSeasonDay", worldMaxSeasonDay);
			nbt.putDouble("worldSeasonTemperature", worldSeasonTemperature);
			nbt.putDouble("worldWindSpeed", worldWindSpeed);
			nbt.putDouble("worldWindTemperature", worldWindTemperature);
			nbt.putString("worldWindDirection", worldWindDirection);
			nbt.putDouble("worldTemperatureC", worldTemperatureC);
			nbt.putDouble("worldTemperatureF", worldTemperatureF);
			nbt.putDouble("worldWeatherTemperature", worldWeatherTemperature);
			nbt.putDouble("worldTimeTemperature", worldTimeTemperature);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				PacketDistributor.DIMENSION.with(level.dimension()).send(new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(new SavedData.Factory<>(WorldVariables::new, WorldVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "tale_of_biomes_mapvars";
		public String modNamespace = "tale_of_biomes";
		public double forgeFlow = 0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			modNamespace = nbt.getString("modNamespace");
			forgeFlow = nbt.getDouble("forgeFlow");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putString("modNamespace", modNamespace);
			nbt.putDouble("forgeFlow", forgeFlow);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				PacketDistributor.ALL.noArg().send(new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(new SavedData.Factory<>(MapVariables::new, MapVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage implements CustomPacketPayload {
		public static final ResourceLocation ID = new ResourceLocation(TaleOfBiomesMod.MODID, "saved_data_sync");
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		@Override
		public void write(final FriendlyByteBuf buffer) {
			buffer.writeInt(type);
			if (data != null)
				buffer.writeNbt(data.save(new CompoundTag()));
		}

		@Override
		public ResourceLocation id() {
			return ID;
		}

		public static void handleData(final SavedDataSyncMessage message, final PlayPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.workHandler().submitAsync(() -> {
					if (message.type == 0)
						MapVariables.clientSide.read(message.data.save(new CompoundTag()));
					else
						WorldVariables.clientSide.read(message.data.save(new CompoundTag()));
				}).exceptionally(e -> {
					context.packetHandler().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}

	public static class PlayerVariables implements INBTSerializable<CompoundTag> {
		public boolean CanTravelToEldenmoor = false;
		public double blockPosX = 0;
		public double blockPosY = 0;
		public double blockPosZ = 0;
		public ItemStack normalSlot0 = ItemStack.EMPTY;
		public ItemStack normalSlot1 = ItemStack.EMPTY;
		public ItemStack normalSlot2 = ItemStack.EMPTY;
		public ItemStack normalSlot3 = ItemStack.EMPTY;
		public ItemStack normalSlot4 = ItemStack.EMPTY;
		public ItemStack normalSlot5 = ItemStack.EMPTY;
		public ItemStack normalSlot6 = ItemStack.EMPTY;
		public ItemStack normalSlot7 = ItemStack.EMPTY;
		public ItemStack normalSlot8 = ItemStack.EMPTY;
		public ItemStack normalSlot9 = ItemStack.EMPTY;
		public ItemStack normalSlot10 = ItemStack.EMPTY;
		public ItemStack normalSlot11 = ItemStack.EMPTY;
		public ItemStack normalSlot12 = ItemStack.EMPTY;
		public ItemStack normalSlot13 = ItemStack.EMPTY;
		public ItemStack normalSlot14 = ItemStack.EMPTY;
		public ItemStack normalSlot15 = ItemStack.EMPTY;
		public ItemStack normalSlot16 = ItemStack.EMPTY;
		public ItemStack normalSlot17 = ItemStack.EMPTY;
		public ItemStack normalSlot18 = ItemStack.EMPTY;
		public ItemStack normalSlot19 = ItemStack.EMPTY;
		public ItemStack normalSlot20 = ItemStack.EMPTY;
		public ItemStack normalSlot21 = ItemStack.EMPTY;
		public ItemStack normalSlot22 = ItemStack.EMPTY;
		public ItemStack normalSlot23 = ItemStack.EMPTY;
		public ItemStack normalSlot24 = ItemStack.EMPTY;
		public ItemStack normalSlot25 = ItemStack.EMPTY;
		public ItemStack normalSlot26 = ItemStack.EMPTY;
		public ItemStack normalSlot27 = ItemStack.EMPTY;
		public ItemStack normalSlot28 = ItemStack.EMPTY;
		public ItemStack normalSlot29 = ItemStack.EMPTY;
		public ItemStack normalSlot30 = ItemStack.EMPTY;
		public ItemStack normalSlot31 = ItemStack.EMPTY;
		public ItemStack normalSlot32 = ItemStack.EMPTY;
		public ItemStack normalSlot33 = ItemStack.EMPTY;
		public ItemStack normalSlot34 = ItemStack.EMPTY;
		public ItemStack normalSlot35 = ItemStack.EMPTY;
		public ItemStack normalSlot36 = ItemStack.EMPTY;
		public ItemStack normalSlot37 = ItemStack.EMPTY;
		public ItemStack normalSlot38 = ItemStack.EMPTY;
		public ItemStack normalSlot39 = ItemStack.EMPTY;
		public ItemStack normalSlot40 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot0 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot1 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot2 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot3 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot4 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot5 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot6 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot7 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot8 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot9 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot10 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot11 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot12 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot13 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot14 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot15 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot16 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot17 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot18 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot19 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot20 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot21 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot22 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot23 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot24 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot25 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot26 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot27 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot28 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot29 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot30 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot31 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot32 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot33 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot34 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot35 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot36 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot37 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot38 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot39 = ItemStack.EMPTY;
		public ItemStack eldenmoorSlot40 = ItemStack.EMPTY;
		public String playerSeasonName = "Spring";
		public double clientTemperatureC = 4.0;
		public double clientTemperatureF = 39.2;
		public double recipePage = 0;
		public boolean isBasicToolTableRecipeBookOpen = false;
		public boolean isRecipeHelperOpen = false;
		public double recipeHelperUpdateTimer = 0;

		@Override
		public CompoundTag serializeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("CanTravelToEldenmoor", CanTravelToEldenmoor);
			nbt.putDouble("blockPosX", blockPosX);
			nbt.putDouble("blockPosY", blockPosY);
			nbt.putDouble("blockPosZ", blockPosZ);
			nbt.put("normalSlot0", normalSlot0.save(new CompoundTag()));
			nbt.put("normalSlot1", normalSlot1.save(new CompoundTag()));
			nbt.put("normalSlot2", normalSlot2.save(new CompoundTag()));
			nbt.put("normalSlot3", normalSlot3.save(new CompoundTag()));
			nbt.put("normalSlot4", normalSlot4.save(new CompoundTag()));
			nbt.put("normalSlot5", normalSlot5.save(new CompoundTag()));
			nbt.put("normalSlot6", normalSlot6.save(new CompoundTag()));
			nbt.put("normalSlot7", normalSlot7.save(new CompoundTag()));
			nbt.put("normalSlot8", normalSlot8.save(new CompoundTag()));
			nbt.put("normalSlot9", normalSlot9.save(new CompoundTag()));
			nbt.put("normalSlot10", normalSlot10.save(new CompoundTag()));
			nbt.put("normalSlot11", normalSlot11.save(new CompoundTag()));
			nbt.put("normalSlot12", normalSlot12.save(new CompoundTag()));
			nbt.put("normalSlot13", normalSlot13.save(new CompoundTag()));
			nbt.put("normalSlot14", normalSlot14.save(new CompoundTag()));
			nbt.put("normalSlot15", normalSlot15.save(new CompoundTag()));
			nbt.put("normalSlot16", normalSlot16.save(new CompoundTag()));
			nbt.put("normalSlot17", normalSlot17.save(new CompoundTag()));
			nbt.put("normalSlot18", normalSlot18.save(new CompoundTag()));
			nbt.put("normalSlot19", normalSlot19.save(new CompoundTag()));
			nbt.put("normalSlot20", normalSlot20.save(new CompoundTag()));
			nbt.put("normalSlot21", normalSlot21.save(new CompoundTag()));
			nbt.put("normalSlot22", normalSlot22.save(new CompoundTag()));
			nbt.put("normalSlot23", normalSlot23.save(new CompoundTag()));
			nbt.put("normalSlot24", normalSlot24.save(new CompoundTag()));
			nbt.put("normalSlot25", normalSlot25.save(new CompoundTag()));
			nbt.put("normalSlot26", normalSlot26.save(new CompoundTag()));
			nbt.put("normalSlot27", normalSlot27.save(new CompoundTag()));
			nbt.put("normalSlot28", normalSlot28.save(new CompoundTag()));
			nbt.put("normalSlot29", normalSlot29.save(new CompoundTag()));
			nbt.put("normalSlot30", normalSlot30.save(new CompoundTag()));
			nbt.put("normalSlot31", normalSlot31.save(new CompoundTag()));
			nbt.put("normalSlot32", normalSlot32.save(new CompoundTag()));
			nbt.put("normalSlot33", normalSlot33.save(new CompoundTag()));
			nbt.put("normalSlot34", normalSlot34.save(new CompoundTag()));
			nbt.put("normalSlot35", normalSlot35.save(new CompoundTag()));
			nbt.put("normalSlot36", normalSlot36.save(new CompoundTag()));
			nbt.put("normalSlot37", normalSlot37.save(new CompoundTag()));
			nbt.put("normalSlot38", normalSlot38.save(new CompoundTag()));
			nbt.put("normalSlot39", normalSlot39.save(new CompoundTag()));
			nbt.put("normalSlot40", normalSlot40.save(new CompoundTag()));
			nbt.put("eldenmoorSlot0", eldenmoorSlot0.save(new CompoundTag()));
			nbt.put("eldenmoorSlot1", eldenmoorSlot1.save(new CompoundTag()));
			nbt.put("eldenmoorSlot2", eldenmoorSlot2.save(new CompoundTag()));
			nbt.put("eldenmoorSlot3", eldenmoorSlot3.save(new CompoundTag()));
			nbt.put("eldenmoorSlot4", eldenmoorSlot4.save(new CompoundTag()));
			nbt.put("eldenmoorSlot5", eldenmoorSlot5.save(new CompoundTag()));
			nbt.put("eldenmoorSlot6", eldenmoorSlot6.save(new CompoundTag()));
			nbt.put("eldenmoorSlot7", eldenmoorSlot7.save(new CompoundTag()));
			nbt.put("eldenmoorSlot8", eldenmoorSlot8.save(new CompoundTag()));
			nbt.put("eldenmoorSlot9", eldenmoorSlot9.save(new CompoundTag()));
			nbt.put("eldenmoorSlot10", eldenmoorSlot10.save(new CompoundTag()));
			nbt.put("eldenmoorSlot11", eldenmoorSlot11.save(new CompoundTag()));
			nbt.put("eldenmoorSlot12", eldenmoorSlot12.save(new CompoundTag()));
			nbt.put("eldenmoorSlot13", eldenmoorSlot13.save(new CompoundTag()));
			nbt.put("eldenmoorSlot14", eldenmoorSlot14.save(new CompoundTag()));
			nbt.put("eldenmoorSlot15", eldenmoorSlot15.save(new CompoundTag()));
			nbt.put("eldenmoorSlot16", eldenmoorSlot16.save(new CompoundTag()));
			nbt.put("eldenmoorSlot17", eldenmoorSlot17.save(new CompoundTag()));
			nbt.put("eldenmoorSlot18", eldenmoorSlot18.save(new CompoundTag()));
			nbt.put("eldenmoorSlot19", eldenmoorSlot19.save(new CompoundTag()));
			nbt.put("eldenmoorSlot20", eldenmoorSlot20.save(new CompoundTag()));
			nbt.put("eldenmoorSlot21", eldenmoorSlot21.save(new CompoundTag()));
			nbt.put("eldenmoorSlot22", eldenmoorSlot22.save(new CompoundTag()));
			nbt.put("eldenmoorSlot23", eldenmoorSlot23.save(new CompoundTag()));
			nbt.put("eldenmoorSlot24", eldenmoorSlot24.save(new CompoundTag()));
			nbt.put("eldenmoorSlot25", eldenmoorSlot25.save(new CompoundTag()));
			nbt.put("eldenmoorSlot26", eldenmoorSlot26.save(new CompoundTag()));
			nbt.put("eldenmoorSlot27", eldenmoorSlot27.save(new CompoundTag()));
			nbt.put("eldenmoorSlot28", eldenmoorSlot28.save(new CompoundTag()));
			nbt.put("eldenmoorSlot29", eldenmoorSlot29.save(new CompoundTag()));
			nbt.put("eldenmoorSlot30", eldenmoorSlot30.save(new CompoundTag()));
			nbt.put("eldenmoorSlot31", eldenmoorSlot31.save(new CompoundTag()));
			nbt.put("eldenmoorSlot32", eldenmoorSlot32.save(new CompoundTag()));
			nbt.put("eldenmoorSlot33", eldenmoorSlot33.save(new CompoundTag()));
			nbt.put("eldenmoorSlot34", eldenmoorSlot34.save(new CompoundTag()));
			nbt.put("eldenmoorSlot35", eldenmoorSlot35.save(new CompoundTag()));
			nbt.put("eldenmoorSlot36", eldenmoorSlot36.save(new CompoundTag()));
			nbt.put("eldenmoorSlot37", eldenmoorSlot37.save(new CompoundTag()));
			nbt.put("eldenmoorSlot38", eldenmoorSlot38.save(new CompoundTag()));
			nbt.put("eldenmoorSlot39", eldenmoorSlot39.save(new CompoundTag()));
			nbt.put("eldenmoorSlot40", eldenmoorSlot40.save(new CompoundTag()));
			nbt.putString("playerSeasonName", playerSeasonName);
			nbt.putDouble("clientTemperatureC", clientTemperatureC);
			nbt.putDouble("clientTemperatureF", clientTemperatureF);
			nbt.putDouble("recipePage", recipePage);
			nbt.putBoolean("isBasicToolTableRecipeBookOpen", isBasicToolTableRecipeBookOpen);
			nbt.putBoolean("isRecipeHelperOpen", isRecipeHelperOpen);
			nbt.putDouble("recipeHelperUpdateTimer", recipeHelperUpdateTimer);
			return nbt;
		}

		@Override
		public void deserializeNBT(CompoundTag nbt) {
			CanTravelToEldenmoor = nbt.getBoolean("CanTravelToEldenmoor");
			blockPosX = nbt.getDouble("blockPosX");
			blockPosY = nbt.getDouble("blockPosY");
			blockPosZ = nbt.getDouble("blockPosZ");
			normalSlot0 = ItemStack.of(nbt.getCompound("normalSlot0"));
			normalSlot1 = ItemStack.of(nbt.getCompound("normalSlot1"));
			normalSlot2 = ItemStack.of(nbt.getCompound("normalSlot2"));
			normalSlot3 = ItemStack.of(nbt.getCompound("normalSlot3"));
			normalSlot4 = ItemStack.of(nbt.getCompound("normalSlot4"));
			normalSlot5 = ItemStack.of(nbt.getCompound("normalSlot5"));
			normalSlot6 = ItemStack.of(nbt.getCompound("normalSlot6"));
			normalSlot7 = ItemStack.of(nbt.getCompound("normalSlot7"));
			normalSlot8 = ItemStack.of(nbt.getCompound("normalSlot8"));
			normalSlot9 = ItemStack.of(nbt.getCompound("normalSlot9"));
			normalSlot10 = ItemStack.of(nbt.getCompound("normalSlot10"));
			normalSlot11 = ItemStack.of(nbt.getCompound("normalSlot11"));
			normalSlot12 = ItemStack.of(nbt.getCompound("normalSlot12"));
			normalSlot13 = ItemStack.of(nbt.getCompound("normalSlot13"));
			normalSlot14 = ItemStack.of(nbt.getCompound("normalSlot14"));
			normalSlot15 = ItemStack.of(nbt.getCompound("normalSlot15"));
			normalSlot16 = ItemStack.of(nbt.getCompound("normalSlot16"));
			normalSlot17 = ItemStack.of(nbt.getCompound("normalSlot17"));
			normalSlot18 = ItemStack.of(nbt.getCompound("normalSlot18"));
			normalSlot19 = ItemStack.of(nbt.getCompound("normalSlot19"));
			normalSlot20 = ItemStack.of(nbt.getCompound("normalSlot20"));
			normalSlot21 = ItemStack.of(nbt.getCompound("normalSlot21"));
			normalSlot22 = ItemStack.of(nbt.getCompound("normalSlot22"));
			normalSlot23 = ItemStack.of(nbt.getCompound("normalSlot23"));
			normalSlot24 = ItemStack.of(nbt.getCompound("normalSlot24"));
			normalSlot25 = ItemStack.of(nbt.getCompound("normalSlot25"));
			normalSlot26 = ItemStack.of(nbt.getCompound("normalSlot26"));
			normalSlot27 = ItemStack.of(nbt.getCompound("normalSlot27"));
			normalSlot28 = ItemStack.of(nbt.getCompound("normalSlot28"));
			normalSlot29 = ItemStack.of(nbt.getCompound("normalSlot29"));
			normalSlot30 = ItemStack.of(nbt.getCompound("normalSlot30"));
			normalSlot31 = ItemStack.of(nbt.getCompound("normalSlot31"));
			normalSlot32 = ItemStack.of(nbt.getCompound("normalSlot32"));
			normalSlot33 = ItemStack.of(nbt.getCompound("normalSlot33"));
			normalSlot34 = ItemStack.of(nbt.getCompound("normalSlot34"));
			normalSlot35 = ItemStack.of(nbt.getCompound("normalSlot35"));
			normalSlot36 = ItemStack.of(nbt.getCompound("normalSlot36"));
			normalSlot37 = ItemStack.of(nbt.getCompound("normalSlot37"));
			normalSlot38 = ItemStack.of(nbt.getCompound("normalSlot38"));
			normalSlot39 = ItemStack.of(nbt.getCompound("normalSlot39"));
			normalSlot40 = ItemStack.of(nbt.getCompound("normalSlot40"));
			eldenmoorSlot0 = ItemStack.of(nbt.getCompound("eldenmoorSlot0"));
			eldenmoorSlot1 = ItemStack.of(nbt.getCompound("eldenmoorSlot1"));
			eldenmoorSlot2 = ItemStack.of(nbt.getCompound("eldenmoorSlot2"));
			eldenmoorSlot3 = ItemStack.of(nbt.getCompound("eldenmoorSlot3"));
			eldenmoorSlot4 = ItemStack.of(nbt.getCompound("eldenmoorSlot4"));
			eldenmoorSlot5 = ItemStack.of(nbt.getCompound("eldenmoorSlot5"));
			eldenmoorSlot6 = ItemStack.of(nbt.getCompound("eldenmoorSlot6"));
			eldenmoorSlot7 = ItemStack.of(nbt.getCompound("eldenmoorSlot7"));
			eldenmoorSlot8 = ItemStack.of(nbt.getCompound("eldenmoorSlot8"));
			eldenmoorSlot9 = ItemStack.of(nbt.getCompound("eldenmoorSlot9"));
			eldenmoorSlot10 = ItemStack.of(nbt.getCompound("eldenmoorSlot10"));
			eldenmoorSlot11 = ItemStack.of(nbt.getCompound("eldenmoorSlot11"));
			eldenmoorSlot12 = ItemStack.of(nbt.getCompound("eldenmoorSlot12"));
			eldenmoorSlot13 = ItemStack.of(nbt.getCompound("eldenmoorSlot13"));
			eldenmoorSlot14 = ItemStack.of(nbt.getCompound("eldenmoorSlot14"));
			eldenmoorSlot15 = ItemStack.of(nbt.getCompound("eldenmoorSlot15"));
			eldenmoorSlot16 = ItemStack.of(nbt.getCompound("eldenmoorSlot16"));
			eldenmoorSlot17 = ItemStack.of(nbt.getCompound("eldenmoorSlot17"));
			eldenmoorSlot18 = ItemStack.of(nbt.getCompound("eldenmoorSlot18"));
			eldenmoorSlot19 = ItemStack.of(nbt.getCompound("eldenmoorSlot19"));
			eldenmoorSlot20 = ItemStack.of(nbt.getCompound("eldenmoorSlot20"));
			eldenmoorSlot21 = ItemStack.of(nbt.getCompound("eldenmoorSlot21"));
			eldenmoorSlot22 = ItemStack.of(nbt.getCompound("eldenmoorSlot22"));
			eldenmoorSlot23 = ItemStack.of(nbt.getCompound("eldenmoorSlot23"));
			eldenmoorSlot24 = ItemStack.of(nbt.getCompound("eldenmoorSlot24"));
			eldenmoorSlot25 = ItemStack.of(nbt.getCompound("eldenmoorSlot25"));
			eldenmoorSlot26 = ItemStack.of(nbt.getCompound("eldenmoorSlot26"));
			eldenmoorSlot27 = ItemStack.of(nbt.getCompound("eldenmoorSlot27"));
			eldenmoorSlot28 = ItemStack.of(nbt.getCompound("eldenmoorSlot28"));
			eldenmoorSlot29 = ItemStack.of(nbt.getCompound("eldenmoorSlot29"));
			eldenmoorSlot30 = ItemStack.of(nbt.getCompound("eldenmoorSlot30"));
			eldenmoorSlot31 = ItemStack.of(nbt.getCompound("eldenmoorSlot31"));
			eldenmoorSlot32 = ItemStack.of(nbt.getCompound("eldenmoorSlot32"));
			eldenmoorSlot33 = ItemStack.of(nbt.getCompound("eldenmoorSlot33"));
			eldenmoorSlot34 = ItemStack.of(nbt.getCompound("eldenmoorSlot34"));
			eldenmoorSlot35 = ItemStack.of(nbt.getCompound("eldenmoorSlot35"));
			eldenmoorSlot36 = ItemStack.of(nbt.getCompound("eldenmoorSlot36"));
			eldenmoorSlot37 = ItemStack.of(nbt.getCompound("eldenmoorSlot37"));
			eldenmoorSlot38 = ItemStack.of(nbt.getCompound("eldenmoorSlot38"));
			eldenmoorSlot39 = ItemStack.of(nbt.getCompound("eldenmoorSlot39"));
			eldenmoorSlot40 = ItemStack.of(nbt.getCompound("eldenmoorSlot40"));
			playerSeasonName = nbt.getString("playerSeasonName");
			clientTemperatureC = nbt.getDouble("clientTemperatureC");
			clientTemperatureF = nbt.getDouble("clientTemperatureF");
			recipePage = nbt.getDouble("recipePage");
			isBasicToolTableRecipeBookOpen = nbt.getBoolean("isBasicToolTableRecipeBookOpen");
			isRecipeHelperOpen = nbt.getBoolean("isRecipeHelperOpen");
			recipeHelperUpdateTimer = nbt.getDouble("recipeHelperUpdateTimer");
		}

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.PLAYER.with(serverPlayer).send(new PlayerVariablesSyncMessage(this));
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final ResourceLocation ID = new ResourceLocation(TaleOfBiomesMod.MODID, "player_variables_sync");

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this(new PlayerVariables());
			this.data.deserializeNBT(buffer.readNbt());
		}

		@Override
		public void write(final FriendlyByteBuf buffer) {
			buffer.writeNbt(data.serializeNBT());
		}

		@Override
		public ResourceLocation id() {
			return ID;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final PlayPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.workHandler().submitAsync(() -> Minecraft.getInstance().player.getData(PLAYER_VARIABLES).deserializeNBT(message.data.serializeNBT())).exceptionally(e -> {
					context.packetHandler().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}
