package com.design.mode.decorate;

public class Test {


    public static void main(String[] args) {
        House house = new VillaHouse();
        house = new LightDecorate(house);
        house = new SofaDecorate(house);
        System.out.println(house.getConfig());
    }


}
