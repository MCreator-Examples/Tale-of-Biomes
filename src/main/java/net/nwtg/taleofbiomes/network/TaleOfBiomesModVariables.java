package net.nwtg.taleofbiomes.network;

import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
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
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;

import java.util.function.Supplier;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TaleOfBiomesModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, TaleOfBiomesMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		TaleOfBiomesMod.addNetworkMessage(SavedDataSyncMessage.TYPE, SavedDataSyncMessage.STREAM_CODEC, SavedDataSyncMessage::handleData);
		TaleOfBiomesMod.addNetworkMessage(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC, PlayerVariablesSyncMessage::handleData);
	}

	@EventBusSubscriber
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
			clone.recipeHelperUpdateTimer = original.recipeHelperUpdateTimer;
			clone.isBasicToolTableRecipeBookOpen = original.isBasicToolTableRecipeBookOpen;
			clone.isRecipeHelperOpen = original.isRecipeHelperOpen;
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
			clone.showPlayerTemperature = original.showPlayerTemperature;
			if (!event.isWasDeath()) {
				clone.playerSeasonName = original.playerSeasonName;
				clone.blockPosX = original.blockPosX;
				clone.blockPosY = original.blockPosY;
				clone.blockPosZ = original.blockPosZ;
				clone.clientTemperatureC = original.clientTemperatureC;
				clone.clientTemperatureF = original.clientTemperatureF;
				clone.recipePage = original.recipePage;
				clone.playerFluid = original.playerFluid;
				clone.playerFluidSaturation = original.playerFluidSaturation;
				clone.playerFluidDamageTime = original.playerFluidDamageTime;
				clone.CanTravelToEldenmoor = original.CanTravelToEldenmoor;
				clone.playerBiomeTemperature = original.playerBiomeTemperature;
				clone.playerHeightTemperature = original.playerHeightTemperature;
				clone.playerIsSleeping = original.playerIsSleeping;
				clone.recipeGroup = original.recipeGroup;
				clone.recipeTimer = original.recipeTimer;
			}
			event.getEntity().setData(PLAYER_VARIABLES, clone);
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "tale_of_biomes_worldvars";
		public String worldSeasonName = "";
		public String worldWindDirection = "";
		public double worldSeasonDay = 0.0;
		public double worldMaxSeasonDay = 0.0;
		public double worldSeasonTemperature = 0.0;
		public double worldWindSpeed = 25.0;
		public double worldWindTemperature = 0.0;
		public double worldTemperatureC = 0.0;
		public double worldTemperatureF = 0.0;
		public double worldWeatherTemperature = 0.0;
		public double worldTimeTemperature = 0.0;
		public double worldMaxWindSpeed = 50.0;
		public boolean setStartSeason = true;

		public static WorldVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			WorldVariables data = new WorldVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			worldSeasonName = nbt.getString("worldSeasonName");
			worldWindDirection = nbt.getString("worldWindDirection");
			worldSeasonDay = nbt.getDouble("worldSeasonDay");
			worldMaxSeasonDay = nbt.getDouble("worldMaxSeasonDay");
			worldSeasonTemperature = nbt.getDouble("worldSeasonTemperature");
			worldWindSpeed = nbt.getDouble("worldWindSpeed");
			worldWindTemperature = nbt.getDouble("worldWindTemperature");
			worldTemperatureC = nbt.getDouble("worldTemperatureC");
			worldTemperatureF = nbt.getDouble("worldTemperatureF");
			worldWeatherTemperature = nbt.getDouble("worldWeatherTemperature");
			worldTimeTemperature = nbt.getDouble("worldTimeTemperature");
			worldMaxWindSpeed = nbt.getDouble("worldMaxWindSpeed");
			setStartSeason = nbt.getBoolean("setStartSeason");
		}

		@Override
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			nbt.putString("worldSeasonName", worldSeasonName);
			nbt.putString("worldWindDirection", worldWindDirection);
			nbt.putDouble("worldSeasonDay", worldSeasonDay);
			nbt.putDouble("worldMaxSeasonDay", worldMaxSeasonDay);
			nbt.putDouble("worldSeasonTemperature", worldSeasonTemperature);
			nbt.putDouble("worldWindSpeed", worldWindSpeed);
			nbt.putDouble("worldWindTemperature", worldWindTemperature);
			nbt.putDouble("worldTemperatureC", worldTemperatureC);
			nbt.putDouble("worldTemperatureF", worldTemperatureF);
			nbt.putDouble("worldWeatherTemperature", worldWeatherTemperature);
			nbt.putDouble("worldTimeTemperature", worldTimeTemperature);
			nbt.putDouble("worldMaxWindSpeed", worldMaxWindSpeed);
			nbt.putBoolean("setStartSeason", setStartSeason);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof ServerLevel level)
				PacketDistributor.sendToPlayersInDimension(level, new SavedDataSyncMessage(1, this));
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
		public double gnPlantTimer = 1200.0;
		public double temperatureTimer = 1.0;
		public boolean isPlayerSleeping = false;
		public double playerSleepTimer = 0;

		public static MapVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			MapVariables data = new MapVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			modNamespace = nbt.getString("modNamespace");
			gnPlantTimer = nbt.getDouble("gnPlantTimer");
			temperatureTimer = nbt.getDouble("temperatureTimer");
			isPlayerSleeping = nbt.getBoolean("isPlayerSleeping");
			playerSleepTimer = nbt.getDouble("playerSleepTimer");
		}

		@Override
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			nbt.putString("modNamespace", modNamespace);
			nbt.putDouble("gnPlantTimer", gnPlantTimer);
			nbt.putDouble("temperatureTimer", temperatureTimer);
			nbt.putBoolean("isPlayerSleeping", isPlayerSleeping);
			nbt.putDouble("playerSleepTimer", playerSleepTimer);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				PacketDistributor.sendToAllPlayers(new SavedDataSyncMessage(0, this));
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

	public record SavedDataSyncMessage(int dataType, SavedData data) implements CustomPacketPayload {
		public static final Type<SavedDataSyncMessage> TYPE = new Type<>(new ResourceLocation(TaleOfBiomesMod.MODID, "saved_data_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SavedDataSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SavedDataSyncMessage message) -> {
			buffer.writeInt(message.dataType);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag(), buffer.registryAccess()));
		}, (RegistryFriendlyByteBuf buffer) -> {
			int dataType = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			SavedData data = null;
			if (nbt != null) {
				data = dataType == 0 ? new MapVariables() : new WorldVariables();
				if (data instanceof MapVariables mapVariables)
					mapVariables.read(nbt, buffer.registryAccess());
				else if (data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt, buffer.registryAccess());
			}
			return new SavedDataSyncMessage(dataType, data);
		});

		@Override
		public Type<SavedDataSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final SavedDataSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> {
					if (message.dataType == 0)
						MapVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
					else
						WorldVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}

	public static class PlayerVariables implements INBTSerializable<CompoundTag> {
		public String playerSeasonName = "";
		public double blockPosX = 0.0;
		public double blockPosY = 0.0;
		public double blockPosZ = 0.0;
		public double clientTemperatureC = 0.0;
		public double clientTemperatureF = 0.0;
		public double recipePage = 0.0;
		public double recipeHelperUpdateTimer = 0.0;
		public double playerFluid = 20.0;
		public double playerFluidSaturation = 3000.0;
		public double playerFluidDamageTime = 100.0;
		public boolean CanTravelToEldenmoor = false;
		public boolean isBasicToolTableRecipeBookOpen = false;
		public boolean isRecipeHelperOpen = false;
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
		public double playerBiomeTemperature = 0;
		public double playerHeightTemperature = 0;
		public boolean showPlayerTemperature = false;
		public boolean playerIsSleeping = false;
		public double recipeGroup = 0;
		public double recipeTimer = 0;

		@Override
		public CompoundTag serializeNBT(HolderLookup.Provider lookupProvider) {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("playerSeasonName", playerSeasonName);
			nbt.putDouble("blockPosX", blockPosX);
			nbt.putDouble("blockPosY", blockPosY);
			nbt.putDouble("blockPosZ", blockPosZ);
			nbt.putDouble("clientTemperatureC", clientTemperatureC);
			nbt.putDouble("clientTemperatureF", clientTemperatureF);
			nbt.putDouble("recipePage", recipePage);
			nbt.putDouble("recipeHelperUpdateTimer", recipeHelperUpdateTimer);
			nbt.putDouble("playerFluid", playerFluid);
			nbt.putDouble("playerFluidSaturation", playerFluidSaturation);
			nbt.putDouble("playerFluidDamageTime", playerFluidDamageTime);
			nbt.putBoolean("CanTravelToEldenmoor", CanTravelToEldenmoor);
			nbt.putBoolean("isBasicToolTableRecipeBookOpen", isBasicToolTableRecipeBookOpen);
			nbt.putBoolean("isRecipeHelperOpen", isRecipeHelperOpen);
			nbt.put("normalSlot0", normalSlot0.saveOptional(lookupProvider));
			nbt.put("normalSlot1", normalSlot1.saveOptional(lookupProvider));
			nbt.put("normalSlot2", normalSlot2.saveOptional(lookupProvider));
			nbt.put("normalSlot3", normalSlot3.saveOptional(lookupProvider));
			nbt.put("normalSlot4", normalSlot4.saveOptional(lookupProvider));
			nbt.put("normalSlot5", normalSlot5.saveOptional(lookupProvider));
			nbt.put("normalSlot6", normalSlot6.saveOptional(lookupProvider));
			nbt.put("normalSlot7", normalSlot7.saveOptional(lookupProvider));
			nbt.put("normalSlot8", normalSlot8.saveOptional(lookupProvider));
			nbt.put("normalSlot9", normalSlot9.saveOptional(lookupProvider));
			nbt.put("normalSlot10", normalSlot10.saveOptional(lookupProvider));
			nbt.put("normalSlot11", normalSlot11.saveOptional(lookupProvider));
			nbt.put("normalSlot12", normalSlot12.saveOptional(lookupProvider));
			nbt.put("normalSlot13", normalSlot13.saveOptional(lookupProvider));
			nbt.put("normalSlot14", normalSlot14.saveOptional(lookupProvider));
			nbt.put("normalSlot15", normalSlot15.saveOptional(lookupProvider));
			nbt.put("normalSlot16", normalSlot16.saveOptional(lookupProvider));
			nbt.put("normalSlot17", normalSlot17.saveOptional(lookupProvider));
			nbt.put("normalSlot18", normalSlot18.saveOptional(lookupProvider));
			nbt.put("normalSlot19", normalSlot19.saveOptional(lookupProvider));
			nbt.put("normalSlot20", normalSlot20.saveOptional(lookupProvider));
			nbt.put("normalSlot21", normalSlot21.saveOptional(lookupProvider));
			nbt.put("normalSlot22", normalSlot22.saveOptional(lookupProvider));
			nbt.put("normalSlot23", normalSlot23.saveOptional(lookupProvider));
			nbt.put("normalSlot24", normalSlot24.saveOptional(lookupProvider));
			nbt.put("normalSlot25", normalSlot25.saveOptional(lookupProvider));
			nbt.put("normalSlot26", normalSlot26.saveOptional(lookupProvider));
			nbt.put("normalSlot27", normalSlot27.saveOptional(lookupProvider));
			nbt.put("normalSlot28", normalSlot28.saveOptional(lookupProvider));
			nbt.put("normalSlot29", normalSlot29.saveOptional(lookupProvider));
			nbt.put("normalSlot30", normalSlot30.saveOptional(lookupProvider));
			nbt.put("normalSlot31", normalSlot31.saveOptional(lookupProvider));
			nbt.put("normalSlot32", normalSlot32.saveOptional(lookupProvider));
			nbt.put("normalSlot33", normalSlot33.saveOptional(lookupProvider));
			nbt.put("normalSlot34", normalSlot34.saveOptional(lookupProvider));
			nbt.put("normalSlot35", normalSlot35.saveOptional(lookupProvider));
			nbt.put("normalSlot36", normalSlot36.saveOptional(lookupProvider));
			nbt.put("normalSlot37", normalSlot37.saveOptional(lookupProvider));
			nbt.put("normalSlot38", normalSlot38.saveOptional(lookupProvider));
			nbt.put("normalSlot39", normalSlot39.saveOptional(lookupProvider));
			nbt.put("normalSlot40", normalSlot40.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot0", eldenmoorSlot0.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot1", eldenmoorSlot1.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot2", eldenmoorSlot2.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot3", eldenmoorSlot3.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot4", eldenmoorSlot4.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot5", eldenmoorSlot5.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot6", eldenmoorSlot6.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot7", eldenmoorSlot7.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot8", eldenmoorSlot8.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot9", eldenmoorSlot9.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot10", eldenmoorSlot10.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot11", eldenmoorSlot11.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot12", eldenmoorSlot12.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot13", eldenmoorSlot13.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot14", eldenmoorSlot14.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot15", eldenmoorSlot15.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot16", eldenmoorSlot16.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot17", eldenmoorSlot17.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot18", eldenmoorSlot18.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot19", eldenmoorSlot19.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot20", eldenmoorSlot20.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot21", eldenmoorSlot21.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot22", eldenmoorSlot22.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot23", eldenmoorSlot23.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot24", eldenmoorSlot24.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot25", eldenmoorSlot25.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot26", eldenmoorSlot26.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot27", eldenmoorSlot27.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot28", eldenmoorSlot28.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot29", eldenmoorSlot29.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot30", eldenmoorSlot30.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot31", eldenmoorSlot31.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot32", eldenmoorSlot32.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot33", eldenmoorSlot33.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot34", eldenmoorSlot34.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot35", eldenmoorSlot35.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot36", eldenmoorSlot36.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot37", eldenmoorSlot37.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot38", eldenmoorSlot38.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot39", eldenmoorSlot39.saveOptional(lookupProvider));
			nbt.put("eldenmoorSlot40", eldenmoorSlot40.saveOptional(lookupProvider));
			nbt.putDouble("playerBiomeTemperature", playerBiomeTemperature);
			nbt.putDouble("playerHeightTemperature", playerHeightTemperature);
			nbt.putBoolean("showPlayerTemperature", showPlayerTemperature);
			nbt.putBoolean("playerIsSleeping", playerIsSleeping);
			nbt.putDouble("recipeGroup", recipeGroup);
			nbt.putDouble("recipeTimer", recipeTimer);
			return nbt;
		}

		@Override
		public void deserializeNBT(HolderLookup.Provider lookupProvider, CompoundTag nbt) {
			playerSeasonName = nbt.getString("playerSeasonName");
			blockPosX = nbt.getDouble("blockPosX");
			blockPosY = nbt.getDouble("blockPosY");
			blockPosZ = nbt.getDouble("blockPosZ");
			clientTemperatureC = nbt.getDouble("clientTemperatureC");
			clientTemperatureF = nbt.getDouble("clientTemperatureF");
			recipePage = nbt.getDouble("recipePage");
			recipeHelperUpdateTimer = nbt.getDouble("recipeHelperUpdateTimer");
			playerFluid = nbt.getDouble("playerFluid");
			playerFluidSaturation = nbt.getDouble("playerFluidSaturation");
			playerFluidDamageTime = nbt.getDouble("playerFluidDamageTime");
			CanTravelToEldenmoor = nbt.getBoolean("CanTravelToEldenmoor");
			isBasicToolTableRecipeBookOpen = nbt.getBoolean("isBasicToolTableRecipeBookOpen");
			isRecipeHelperOpen = nbt.getBoolean("isRecipeHelperOpen");
			normalSlot0 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot0"));
			normalSlot1 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot1"));
			normalSlot2 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot2"));
			normalSlot3 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot3"));
			normalSlot4 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot4"));
			normalSlot5 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot5"));
			normalSlot6 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot6"));
			normalSlot7 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot7"));
			normalSlot8 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot8"));
			normalSlot9 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot9"));
			normalSlot10 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot10"));
			normalSlot11 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot11"));
			normalSlot12 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot12"));
			normalSlot13 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot13"));
			normalSlot14 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot14"));
			normalSlot15 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot15"));
			normalSlot16 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot16"));
			normalSlot17 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot17"));
			normalSlot18 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot18"));
			normalSlot19 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot19"));
			normalSlot20 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot20"));
			normalSlot21 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot21"));
			normalSlot22 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot22"));
			normalSlot23 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot23"));
			normalSlot24 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot24"));
			normalSlot25 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot25"));
			normalSlot26 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot26"));
			normalSlot27 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot27"));
			normalSlot28 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot28"));
			normalSlot29 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot29"));
			normalSlot30 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot30"));
			normalSlot31 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot31"));
			normalSlot32 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot32"));
			normalSlot33 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot33"));
			normalSlot34 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot34"));
			normalSlot35 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot35"));
			normalSlot36 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot36"));
			normalSlot37 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot37"));
			normalSlot38 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot38"));
			normalSlot39 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot39"));
			normalSlot40 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("normalSlot40"));
			eldenmoorSlot0 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot0"));
			eldenmoorSlot1 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot1"));
			eldenmoorSlot2 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot2"));
			eldenmoorSlot3 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot3"));
			eldenmoorSlot4 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot4"));
			eldenmoorSlot5 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot5"));
			eldenmoorSlot6 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot6"));
			eldenmoorSlot7 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot7"));
			eldenmoorSlot8 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot8"));
			eldenmoorSlot9 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot9"));
			eldenmoorSlot10 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot10"));
			eldenmoorSlot11 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot11"));
			eldenmoorSlot12 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot12"));
			eldenmoorSlot13 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot13"));
			eldenmoorSlot14 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot14"));
			eldenmoorSlot15 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot15"));
			eldenmoorSlot16 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot16"));
			eldenmoorSlot17 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot17"));
			eldenmoorSlot18 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot18"));
			eldenmoorSlot19 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot19"));
			eldenmoorSlot20 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot20"));
			eldenmoorSlot21 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot21"));
			eldenmoorSlot22 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot22"));
			eldenmoorSlot23 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot23"));
			eldenmoorSlot24 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot24"));
			eldenmoorSlot25 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot25"));
			eldenmoorSlot26 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot26"));
			eldenmoorSlot27 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot27"));
			eldenmoorSlot28 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot28"));
			eldenmoorSlot29 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot29"));
			eldenmoorSlot30 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot30"));
			eldenmoorSlot31 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot31"));
			eldenmoorSlot32 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot32"));
			eldenmoorSlot33 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot33"));
			eldenmoorSlot34 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot34"));
			eldenmoorSlot35 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot35"));
			eldenmoorSlot36 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot36"));
			eldenmoorSlot37 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot37"));
			eldenmoorSlot38 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot38"));
			eldenmoorSlot39 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot39"));
			eldenmoorSlot40 = ItemStack.parseOptional(lookupProvider, nbt.getCompound("eldenmoorSlot40"));
			playerBiomeTemperature = nbt.getDouble("playerBiomeTemperature");
			playerHeightTemperature = nbt.getDouble("playerHeightTemperature");
			showPlayerTemperature = nbt.getBoolean("showPlayerTemperature");
			playerIsSleeping = nbt.getBoolean("playerIsSleeping");
			recipeGroup = nbt.getDouble("recipeGroup");
			recipeTimer = nbt.getDouble("recipeTimer");
		}

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.sendToPlayer(serverPlayer, new PlayerVariablesSyncMessage(this));
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(new ResourceLocation(TaleOfBiomesMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec
				.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> buffer.writeNbt(message.data().serializeNBT(buffer.registryAccess())), (RegistryFriendlyByteBuf buffer) -> {
					PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
					message.data.deserializeNBT(buffer.registryAccess(), buffer.readNbt());
					return message;
				});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> context.player().getData(PLAYER_VARIABLES).deserializeNBT(context.player().registryAccess(), message.data.serializeNBT(context.player().registryAccess()))).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}
