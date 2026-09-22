package com.shadow2601.worldfall;

import com.shadow2601.worldfall.registry.WFBlocks;
import com.shadow2601.worldfall.registry.WFItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(WorldfallMod.MOD_ID)
public final class WorldfallMod {
    public static final String MOD_ID = "worldfall";

    public WorldfallMod(IEventBus modEventBus) {
        WFItems.ITEMS.register(modEventBus);
        WFBlocks.BLOCKS.register(modEventBus);
        WFItems.CREATIVE_TAB.register(modEventBus);
    }
}
