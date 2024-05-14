package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class FlowerPotOnBlockRightClickedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		ItemStack flower = ItemStack.EMPTY;
		boolean runScript = false;
		runScript = true;
		if (blockstate.getBlock() == TaleOfBiomesModBlocks.BLUE_ASTER_FLOWER_POT.get()) {
			flower = new ItemStack(TaleOfBiomesModBlocks.BLUE_ASTER.get());
		} else if (blockstate.getBlock() == TaleOfBiomesModBlocks.PURPLE_ASTER_FLOWER_POT.get()) {
			flower = new ItemStack(TaleOfBiomesModBlocks.PURPLE_ASTER.get());
		} else if (blockstate.getBlock() == TaleOfBiomesModBlocks.MAGENTA_ASTER_FLOWER_POT.get()) {
			flower = new ItemStack(TaleOfBiomesModBlocks.MAGENTA_ASTER.get());
		} else if (blockstate.getBlock() == TaleOfBiomesModBlocks.GOLDENROD_FLOWER_POT.get()) {
			flower = new ItemStack(TaleOfBiomesModBlocks.GOLDENROD.get());
		} else if (blockstate.getBlock() == TaleOfBiomesModBlocks.WILD_INDIGO_FLOWER_POT.get()) {
			flower = new ItemStack(TaleOfBiomesModBlocks.WILD_INDIGO.get());
		} else {
			runScript = false;
		}
		if (runScript) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = flower.copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = Blocks.FLOWER_POT.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
