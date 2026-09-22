package com.shadow2601.worldfall.registry;

import com.shadow2601.worldfall.WorldfallMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public final class WFItems {
    private WFItems() {}

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WorldfallMod.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorldfallMod.MOD_ID);

    public static final Supplier<Item> WORLDCORE =
            ITEMS.registerSimpleItem("worldcore", new Item.Properties());
    public static final Supplier<Item> MILITARY_ALLOY =
            ITEMS.registerSimpleItem("military_alloy", new Item.Properties());
    public static final Supplier<Item> INFECTED_BIOMASS =
            ITEMS.registerSimpleItem("infected_biomass", new Item.Properties());

    public static final Supplier<CreativeModeTab> TAB = CREATIVE_TAB.register(
            "worldfall",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.worldfall"))
                    .icon(() -> new ItemStack(WORLDCORE.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(WORLDCORE.get());
                        output.accept(MILITARY_ALLOY.get());
                        output.accept(INFECTED_BIOMASS.get());
                        output.accept(WFBlocks.POWER_GENERATOR.get());
                    })
                    .build()
    );
}
