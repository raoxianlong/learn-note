package com.design.mode.builder;

public class Test {

    public static void main(String[] args) {
        CarConfiguration carConfiguration = new CarConfiguration.Builder()
                .buildColor("红色")
                .buildModel("H512")
                .buildSpeed("300km/h")
                .buildBraking("良好")
                .build();

        System.out.println(carConfiguration);
    }

}
