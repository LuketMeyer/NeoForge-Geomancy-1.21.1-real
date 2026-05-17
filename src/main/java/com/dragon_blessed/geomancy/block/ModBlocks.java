package com.dragon_blessed.geomancy.block;

import com.dragon_blessed.geomancy.Geomancy;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks( Geomancy.MODID );

    public static void register( IEventBus eventBus ) {
        BLOCKS.register(eventBus);
    }
    
}
