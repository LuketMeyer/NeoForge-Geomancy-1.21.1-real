package com.dragon_blessed.geomancy.item;

import java.util.function.Supplier;

import com.dragon_blessed.geomancy.Geomancy;
import com.dragon_blessed.geomancy.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Geomancy.MODID);


    public static final Supplier<CreativeModeTab> DOODAD_ITEMS_TAB = CREATIVE_MODE_TAB.register( "doodad_items_tab",
        () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModItems.DOODAD.get()))
        .title( Component.translatable("creativetab.geomancymod.doodad_items") )
        .displayItems( (itemDisplayParameters, output) -> {
            output.accept(ModItems.DOODAD);
            output.accept( ModItems.SPARKING_DOODAD);
            output.accept( ModItems.ODD_GEM );

        } ).build()
    );

    public static final Supplier<CreativeModeTab> DOODAD_BLOCKS_TAB = CREATIVE_MODE_TAB.register( "doodad_blocks_tab",
        () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModBlocks.INVERTED_GRASS))
        .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Geomancy.MODID, "doodad_items_tab"))
        .title( Component.translatable("creativetab.geomancymod.doodad_blocks") )
        .displayItems( (itemDisplayParameters, output) -> {
            output.accept(ModBlocks.INVERTED_GRASS);
            output.accept(ModBlocks.ODD_ORE);
            output.accept(ModBlocks.ODD_BLOCK);

        } ).build()
    );

     public static void register(IEventBus eventBus){

        CREATIVE_MODE_TAB.register( eventBus );
     }       
}
