package com.elementals.morebendings.neoforge;

import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;
import com.elementals.morebendings.Constants;
import com.elementals.morebendings.CommonClass;

@Mod(Constants.MOD_ID)
public class ElementalsMoreBendingsNeoForge {

    public ElementalsMoreBendingsNeoForge(IEventBus modEventBus) {
        CommonClass.init();
    }
}
