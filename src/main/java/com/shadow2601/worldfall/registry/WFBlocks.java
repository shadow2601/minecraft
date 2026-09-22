package com.shadow2601.worldfall.registry;

import com.shadow2601.worldfall.WorldfallMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public final class WFBlocks {
    private WFBlocks() {}

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(WorldfallMod.MOD_ID);

    public static final Supplier<Block> POWER_GENERATOR = BLOCKS.register(
            "power_generator",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(5.0F, 8.0F))
    );

    static {
        WFItems.ITEMS.register("power_generator",
                () -> new BlockItem(POWER_GENERATOR.get(), new Item.Properties()));
    }
}
