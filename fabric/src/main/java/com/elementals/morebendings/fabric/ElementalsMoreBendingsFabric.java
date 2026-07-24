package com.elementals.morebendings.fabric;

import net.fabricmc.api.ModInitializer;
import com.elementals.morebendings.CommonClass;

public class ElementalsMoreBendingsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CommonClass.init();
    }
}
