
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.block.entity.TilledSoilBlockEntity;
import net.nwtg.taleofbiomes.block.entity.RoseShrubBlockEntity;
import net.nwtg.taleofbiomes.block.entity.RoseQuartzBuddingBlockEntity;
import net.nwtg.taleofbiomes.block.entity.RiceCropBlockEntity;
import net.nwtg.taleofbiomes.block.entity.PiruffSaplingBlockEntity;
import net.nwtg.taleofbiomes.block.entity.PiruffBarrelBlockEntity;
import net.nwtg.taleofbiomes.block.entity.PhosphoriteStoneBlockEntity;
import net.nwtg.taleofbiomes.block.entity.PhosphoriteCrystalBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnLadderBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnFurnaceOnBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnFurnaceBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockMiddleTopBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockMiddleCenterBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockMiddleBottomBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockFoundationBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockCornerTopBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockCornerCenterBlockEntity;
import net.nwtg.taleofbiomes.block.entity.KilnBlockCornerBottomBlockEntity;
import net.nwtg.taleofbiomes.block.entity.IvyShrubBlockEntity;
import net.nwtg.taleofbiomes.block.entity.HayStrawBlockEntity;
import net.nwtg.taleofbiomes.block.entity.HayGrassBlockEntity;
import net.nwtg.taleofbiomes.block.entity.HangingLanternOnBlockEntity;
import net.nwtg.taleofbiomes.block.entity.HangingLanternBlockEntity;
import net.nwtg.taleofbiomes.block.entity.GroundLanternOnBlockEntity;
import net.nwtg.taleofbiomes.block.entity.GroundLanternBlockEntity;
import net.nwtg.taleofbiomes.block.entity.CrusherBlockEntity;
import net.nwtg.taleofbiomes.block.entity.CraftingTableBlockEntity;
import net.nwtg.taleofbiomes.block.entity.BasicToolTableBlockEntity;
import net.nwtg.taleofbiomes.block.entity.BasicStoneTableBlockEntity;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TaleOfBiomesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, TaleOfBiomesMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> TILLED_SOIL = register("tilled_soil", TaleOfBiomesModBlocks.TILLED_SOIL, TilledSoilBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> IVY_SHRUB = register("ivy_shrub", TaleOfBiomesModBlocks.IVY_SHRUB, IvyShrubBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ROSE_SHRUB = register("rose_shrub", TaleOfBiomesModBlocks.ROSE_SHRUB, RoseShrubBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PHOSPHORITE_STONE = register("phosphorite_stone", TaleOfBiomesModBlocks.PHOSPHORITE_STONE, PhosphoriteStoneBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PHOSPHORITE_CRYSTAL = register("phosphorite_crystal", TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL, PhosphoriteCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_FURNACE = register("kiln_furnace", TaleOfBiomesModBlocks.KILN_FURNACE, KilnFurnaceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_FURNACE_ON = register("kiln_furnace_on", TaleOfBiomesModBlocks.KILN_FURNACE_ON, KilnFurnaceOnBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_LADDER = register("kiln_ladder", TaleOfBiomesModBlocks.KILN_LADDER, KilnLadderBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_BLOCK_CORNER_BOTTOM = register("kiln_block_corner_bottom", TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_BOTTOM, KilnBlockCornerBottomBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_BLOCK_CORNER_CENTER = register("kiln_block_corner_center", TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_CENTER, KilnBlockCornerCenterBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_BLOCK_CORNER_TOP = register("kiln_block_corner_top", TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_TOP, KilnBlockCornerTopBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_BLOCK_MIDDLE_BOTTOM = register("kiln_block_middle_bottom", TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_BOTTOM, KilnBlockMiddleBottomBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_BLOCK_MIDDLE_CENTER = register("kiln_block_middle_center", TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_CENTER, KilnBlockMiddleCenterBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_BLOCK_MIDDLE_TOP = register("kiln_block_middle_top", TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_TOP, KilnBlockMiddleTopBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> KILN_BLOCK_FOUNDATION = register("kiln_block_foundation", TaleOfBiomesModBlocks.KILN_BLOCK_FOUNDATION, KilnBlockFoundationBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> HAY_GRASS = register("hay_grass", TaleOfBiomesModBlocks.HAY_GRASS, HayGrassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> HAY_STRAW = register("hay_straw", TaleOfBiomesModBlocks.HAY_STRAW, HayStrawBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> HANGING_LANTERN = register("hanging_lantern", TaleOfBiomesModBlocks.HANGING_LANTERN, HangingLanternBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> HANGING_LANTERN_ON = register("hanging_lantern_on", TaleOfBiomesModBlocks.HANGING_LANTERN_ON, HangingLanternOnBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GROUND_LANTERN = register("ground_lantern", TaleOfBiomesModBlocks.GROUND_LANTERN, GroundLanternBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GROUND_LANTERN_ON = register("ground_lantern_on", TaleOfBiomesModBlocks.GROUND_LANTERN_ON, GroundLanternOnBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BASIC_TOOL_TABLE = register("basic_tool_table", TaleOfBiomesModBlocks.BASIC_TOOL_TABLE, BasicToolTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PIRUFF_SAPLING = register("piruff_sapling", TaleOfBiomesModBlocks.PIRUFF_SAPLING, PiruffSaplingBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BASIC_STONE_TABLE = register("basic_stone_table", TaleOfBiomesModBlocks.BASIC_STONE_TABLE, BasicStoneTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> RICE_CROP = register("rice_crop", TaleOfBiomesModBlocks.RICE_CROP, RiceCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ROSE_QUARTZ_BUDDING = register("rose_quartz_budding", TaleOfBiomesModBlocks.ROSE_QUARTZ_BUDDING, RoseQuartzBuddingBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CRAFTING_TABLE = register("crafting_table", TaleOfBiomesModBlocks.CRAFTING_TABLE, CraftingTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PIRUFF_BARREL = register("piruff_barrel", TaleOfBiomesModBlocks.PIRUFF_BARREL, PiruffBarrelBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CRUSHER = register("crusher", TaleOfBiomesModBlocks.CRUSHER, CrusherBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TILLED_SOIL.get(), (blockEntity, side) -> ((TilledSoilBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, IVY_SHRUB.get(), (blockEntity, side) -> ((IvyShrubBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ROSE_SHRUB.get(), (blockEntity, side) -> ((RoseShrubBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PHOSPHORITE_STONE.get(), (blockEntity, side) -> ((PhosphoriteStoneBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PHOSPHORITE_CRYSTAL.get(), (blockEntity, side) -> ((PhosphoriteCrystalBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_FURNACE.get(), (blockEntity, side) -> ((KilnFurnaceBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_FURNACE_ON.get(), (blockEntity, side) -> ((KilnFurnaceOnBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_LADDER.get(), (blockEntity, side) -> ((KilnLadderBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_BLOCK_CORNER_BOTTOM.get(), (blockEntity, side) -> ((KilnBlockCornerBottomBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_BLOCK_CORNER_CENTER.get(), (blockEntity, side) -> ((KilnBlockCornerCenterBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_BLOCK_CORNER_TOP.get(), (blockEntity, side) -> ((KilnBlockCornerTopBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_BLOCK_MIDDLE_BOTTOM.get(), (blockEntity, side) -> ((KilnBlockMiddleBottomBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_BLOCK_MIDDLE_CENTER.get(), (blockEntity, side) -> ((KilnBlockMiddleCenterBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_BLOCK_MIDDLE_TOP.get(), (blockEntity, side) -> ((KilnBlockMiddleTopBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, KILN_BLOCK_FOUNDATION.get(), (blockEntity, side) -> ((KilnBlockFoundationBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HAY_GRASS.get(), (blockEntity, side) -> ((HayGrassBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HAY_STRAW.get(), (blockEntity, side) -> ((HayStrawBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HANGING_LANTERN.get(), (blockEntity, side) -> ((HangingLanternBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HANGING_LANTERN_ON.get(), (blockEntity, side) -> ((HangingLanternOnBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GROUND_LANTERN.get(), (blockEntity, side) -> ((GroundLanternBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GROUND_LANTERN_ON.get(), (blockEntity, side) -> ((GroundLanternOnBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BASIC_TOOL_TABLE.get(), (blockEntity, side) -> ((BasicToolTableBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PIRUFF_SAPLING.get(), (blockEntity, side) -> ((PiruffSaplingBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BASIC_STONE_TABLE.get(), (blockEntity, side) -> ((BasicStoneTableBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RICE_CROP.get(), (blockEntity, side) -> ((RiceCropBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ROSE_QUARTZ_BUDDING.get(), (blockEntity, side) -> ((RoseQuartzBuddingBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CRAFTING_TABLE.get(), (blockEntity, side) -> ((CraftingTableBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PIRUFF_BARREL.get(), (blockEntity, side) -> ((PiruffBarrelBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CRUSHER.get(), (blockEntity, side) -> ((CrusherBlockEntity) blockEntity).getItemHandler());
	}
}
