package com.design.mode.decorate;

/**
 *  电灯装饰类
 */
public class LightDecorate extends AbstractDecorate{

    protected LightDecorate(House house) {
        super(house);
    }

    @Override
    protected String getConfig() {
        return super.getConfig() + "，全LED灯饰";
    }

}
