package com.design.mode.abstractfactory;


public class Test {

    public static void main(String[] args) {
        FerrariCarFactory ferrariCarFactory = new FerrariCarFactory();
        Car car = ferrariCarFactory.createCar();
        CarConfiguration configuration = ferrariCarFactory.getCarConfiguration();
        System.out.println(car);
    }


}
