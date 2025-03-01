package net.weaverfever.stylishstiles.compat.deeperdarker;

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
import net.minecraft.util.Identifier;
import net.weaverfever.stylishstiles.StylishStiles;
import net.weaverfever.stylishstiles.block.custom.Stile;
import com.kyanite.deeperdarker.content.DDBlocks;

public class DeeperDarker {

    private static final Block ECHO_STILE = registerBlock("echo_stile", new Stile(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    private static final Block BLOOM_STILE = registerBlock("bloom_stile", new Stile(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(StylishStiles.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(StylishStiles.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static void addBlocksToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(ECHO_STILE);
        entries.add(BLOOM_STILE);

    }

    public static void registerModBlocks() {
        StylishStiles.LOGGER.info("Registering ModBlocks for  " + StylishStiles.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(DeeperDarker::addBlocksToBuildingBlocksItemGroup);
    }
}
