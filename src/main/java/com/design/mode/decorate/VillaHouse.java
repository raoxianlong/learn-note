package com.design.mode.decorate;

/**
 *  别墅
 */
public class VillaHouse extends House {
    @Override
    protected String getConfig() {
        return "精装";
    }

}
