package com.design.mode.decorate;

/**
 *  沙发装饰类
 */
public class SofaDecorate extends AbstractDecorate{

    protected SofaDecorate(House house) {
        super(house);
    }

    @Override
    protected String getConfig() {
        return super.getConfig() + "，真皮沙发";
    }
}
