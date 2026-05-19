package com.dragon_blessed.geomancy.item;

import com.dragon_blessed.geomancy.Geomancy;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems( Geomancy.MODID );

    //where items are declared, java convention has their member (DOODAD) be in full caps,
    //internal item name, doodad, needs to be all lowercase
    public static final DeferredItem<Item> DOODAD = ITEMS.register( "doodad", 
        () -> new Item(new Item.Properties() )
    );

    public static final DeferredItem<Item> SPARKING_DOODAD = ITEMS.register( "sparking_doodad", 
        () -> new Item(new Item.Properties() )
    );

    public static final DeferredItem<Item> ODD_GEM = ITEMS.register( "odd_gem", 
        () -> new Item(new Item.Properties() )
    );

    public static void register(IEventBus eventBus ) {
        ITEMS.register( eventBus );
    }

}
