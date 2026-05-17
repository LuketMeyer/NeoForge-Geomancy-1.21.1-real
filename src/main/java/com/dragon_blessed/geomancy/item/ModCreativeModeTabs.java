package com.dragon_blessed.geomancy.item;

import java.util.function.Supplier;

import com.dragon_blessed.geomancy.Geomancy;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Geomancy.MODID);


    public static final Supplier<CreativeModeTab> DOODAD_ITEMS_TAB = CREATIVE_MODE_TAB.register( "doodad_items_tab",
        () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModItems.DOODAD.get()))
        .title( Component.translatable("creativetab.geomancy.doodad_items") )
        .displayItems( (itemDisplayParameters, output) -> {
            output.accept(ModItems.DOODAD);
            output.accept( ModItems.SPARKING_DOODAD);

        } ).build()
    );

     public static void register(IEventBus eventBus){

        CREATIVE_MODE_TAB.register( eventBus );
     }       
}
