package com.design.mode.abstractfactory;

public class FerrariCarFactory implements CarFactory{

    public Car createCar() {
        return new FerrariCar("红色", "ZH209");
    }

    public CarConfiguration getCarConfiguration() {
        return new CarConfiguration() {};
    }
}
