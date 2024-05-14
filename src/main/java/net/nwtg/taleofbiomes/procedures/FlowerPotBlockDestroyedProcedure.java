package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FlowerPotBlockDestroyedProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		ItemStack itemToRplace = ItemStack.EMPTY;
		boolean spawnGem = false;
		BlockState blockPosition = Blocks.AIR.defaultBlockState();
		blockPosition = (world.getBlockState(BlockPos.containing(x, y, z)));
		spawnGem = true;
		if (blockPosition.getBlock() == TaleOfBiomesModBlocks.BLUE_ASTER_FLOWER_POT.get()) {
			itemToRplace = new ItemStack(TaleOfBiomesModBlocks.BLUE_ASTER.get());
		} else if (blockPosition.getBlock() == TaleOfBiomesModBlocks.PURPLE_ASTER_FLOWER_POT.get()) {
			itemToRplace = new ItemStack(TaleOfBiomesModBlocks.PURPLE_ASTER.get());
		} else if (blockPosition.getBlock() == TaleOfBiomesModBlocks.MAGENTA_ASTER_FLOWER_POT.get()) {
			itemToRplace = new ItemStack(TaleOfBiomesModBlocks.MAGENTA_ASTER.get());
		} else if (blockPosition.getBlock() == TaleOfBiomesModBlocks.GOLDENROD_FLOWER_POT.get()) {
			itemToRplace = new ItemStack(TaleOfBiomesModBlocks.GOLDENROD.get());
		} else if (blockPosition.getBlock() == TaleOfBiomesModBlocks.WILD_INDIGO_FLOWER_POT.get()) {
			itemToRplace = new ItemStack(TaleOfBiomesModBlocks.WILD_INDIGO.get());
		} else {
			spawnGem = false;
		}
		if (spawnGem) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), itemToRplace);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
