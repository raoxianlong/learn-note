package com.design.mode.decorate;

/**
 *  包装类
 */
public abstract class AbstractDecorate extends House{

    protected House house;

    protected AbstractDecorate(House house){
        this.house = house;
    }

    @Override
    protected String getConfig() {
        return this.house.getConfig();
    }
}
