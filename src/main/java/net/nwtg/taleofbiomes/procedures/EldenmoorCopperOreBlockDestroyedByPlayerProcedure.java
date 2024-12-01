package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EldenmoorCopperOreBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double nRandom = 0;
		double nLevel = 0;
		double nX = 0;
		double nY = 0;
		double nZ = 0;
		ItemStack iMainHand = ItemStack.EMPTY;
		ItemStack iPure = ItemStack.EMPTY;
		ItemStack iMixed = ItemStack.EMPTY;
		ItemStack iUnpure = ItemStack.EMPTY;
		iMainHand = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (iMainHand.getItem() instanceof PickaxeItem && iMainHand.is(ItemTags.create(ResourceLocation.parse("mo_tool_tiers:normal_stone")))) {
			iPure = new ItemStack(TaleOfBiomesModItems.RAW_PURE_COPPER.get());
			iMixed = new ItemStack(TaleOfBiomesModItems.RAW_MIXED_COPPER.get());
			iUnpure = new ItemStack(TaleOfBiomesModItems.RAW_IMPURE_COPPER.get());
			nX = Math.floor(x) + 0.5;
			nY = Math.floor(y) + 0.25;
			nZ = Math.floor(z) + 0.5;
			if (iMainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)) != 0) {
				nLevel = iMainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE));
				TaleOfBiomesMod.LOGGER.info(nLevel);
				if (nLevel == 3) {
					for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 3, 5); index0++) {
						nRandom = Mth.nextInt(RandomSource.create(), 1, 100);
						if (nRandom >= 85) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iPure);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (nRandom >= 60) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iMixed);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iUnpure);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (nLevel == 2) {
					for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 2, 4); index1++) {
						nRandom = Mth.nextInt(RandomSource.create(), 1, 100);
						if (nRandom >= 85) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iPure);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (nRandom >= 60) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iMixed);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iUnpure);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else {
					for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 3); index2++) {
						nRandom = Mth.nextInt(RandomSource.create(), 1, 100);
						if (nRandom >= 85) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iPure);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (nRandom >= 60) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iMixed);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iUnpure);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			} else if (iMainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH)) != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, new ItemStack(TaleOfBiomesModBlocks.ELDENMOOR_COPPER_ORE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				nRandom = Mth.nextInt(RandomSource.create(), 1, 100);
				if (nRandom >= 85) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iPure);
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (nRandom >= 60) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iMixed);
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, nX, nY, nZ, iUnpure);
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
