package net.weaverfever.stylishstiles.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.weaverfever.stylishstiles.StylishStiles;
import net.weaverfever.stylishstiles.block.custom.Stile;

public class ModBlocks {

	private static Block registerBlock(String string, Block block, RegistryKey<Block> blockKey) {
		// Items need to be registered with a different type of registry key, but the ID
		// can be the same.
		RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());

		BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
		Registry.register(Registries.ITEM, itemKey, blockItem);
		return Registry.register(Registries.BLOCK, blockKey, block);
	}
	
	public static final RegistryKey<Block> OAK_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "oak_stile"));
    private static final Block OAK_STILE = registerBlock("oak_stile", new Stile(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).registryKey(OAK_STILE_KEY)), OAK_STILE_KEY);

	public static final RegistryKey<Block> ACACIA_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "acacia_stile"));
	private static final Block ACACIA_STILE = registerBlock("acacia_stile", new Stile(AbstractBlock.Settings.copy(Blocks.ACACIA_FENCE).registryKey(ACACIA_STILE_KEY)), ACACIA_STILE_KEY);

	public static final RegistryKey<Block> DARK_OAK_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "dark_oak_stile"));
    private static final Block DARK_OAK_STILE = registerBlock("dark_oak_stile", new Stile(AbstractBlock.Settings.copy(Blocks.DARK_OAK_FENCE).registryKey(DARK_OAK_STILE_KEY)), DARK_OAK_STILE_KEY);
    
	public static final RegistryKey<Block> SPRUCE_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "spruce_stile"));
	private static final Block SPRUCE_STILE = registerBlock("spruce_stile", new Stile(AbstractBlock.Settings.copy(Blocks.SPRUCE_FENCE).registryKey(SPRUCE_STILE_KEY)), SPRUCE_STILE_KEY);
	
	public static final RegistryKey<Block> BIRCH_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "birch_stile"));
    private static final Block BIRCH_STILE = registerBlock("birch_stile", new Stile(AbstractBlock.Settings.copy(Blocks.BIRCH_FENCE).registryKey(BIRCH_STILE_KEY)), BIRCH_STILE_KEY);

	public static final RegistryKey<Block> JUNGLE_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "jungle_stile"));
    private static final Block JUNGLE_STILE = registerBlock("jungle_stile", new Stile(AbstractBlock.Settings.copy(Blocks.JUNGLE_FENCE).registryKey(JUNGLE_STILE_KEY)), JUNGLE_STILE_KEY);

	public static final RegistryKey<Block> CRIMSON_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "crimson_stile"));
    private static final Block CRIMSON_STILE = registerBlock("crimson_stile", new Stile(AbstractBlock.Settings.copy(Blocks.CRIMSON_FENCE).registryKey(CRIMSON_STILE_KEY)), CRIMSON_STILE_KEY);

	public static final RegistryKey<Block> WARPED_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "warped_stile"));
    private static final Block WARPED_STILE = registerBlock("warped_stile", new Stile(AbstractBlock.Settings.copy(Blocks.WARPED_FENCE).registryKey(WARPED_STILE_KEY)), WARPED_STILE_KEY);

	public static final RegistryKey<Block> MANGROVE_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "mangrove_stile"));
    private static final Block MANGROVE_STILE = registerBlock("mangrove_stile", new Stile(AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE).registryKey(MANGROVE_STILE_KEY)), MANGROVE_STILE_KEY);

	public static final RegistryKey<Block> BAMBOO_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "bamboo_stile"));
    private static final Block BAMBOO_STILE = registerBlock("bamboo_stile", new Stile(AbstractBlock.Settings.copy(Blocks.BAMBOO_FENCE).registryKey(BAMBOO_STILE_KEY)), BAMBOO_STILE_KEY);

	public static final RegistryKey<Block> CHERRY_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "cherry_stile"));
    private static final Block CHERRY_STILE = registerBlock("cherry_stile", new Stile(AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE).registryKey(CHERRY_STILE_KEY)), CHERRY_STILE_KEY);

	public static final RegistryKey<Block> NETHER_BRICK_STILE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StylishStiles.MOD_ID, "nether_brick_stile"));
    private static final Block NETHER_BRICK_STILE = registerBlock("nether_brick_stile", new Stile(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).registryKey(NETHER_BRICK_STILE_KEY)), NETHER_BRICK_STILE_KEY);

	
    private static void addBlocksToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(OAK_STILE);
        entries.add(ACACIA_STILE);
        entries.add(DARK_OAK_STILE);
        entries.add(BIRCH_STILE);
        entries.add(SPRUCE_STILE);
        entries.add(JUNGLE_STILE);
        entries.add(CRIMSON_STILE);
        entries.add(WARPED_STILE);
        entries.add(MANGROVE_STILE);
        entries.add(BAMBOO_STILE);
        entries.add(CHERRY_STILE);
        entries.add(NETHER_BRICK_STILE);

    }

    public static void registerModBlocks() {
        StylishStiles.LOGGER.info("Registering ModBlocks for  " + StylishStiles.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingBlocksItemGroup);
    }
}
