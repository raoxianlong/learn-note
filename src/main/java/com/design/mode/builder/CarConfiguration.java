package com.design.mode.builder;

public class CarConfiguration {

    private String color; // 颜色
    private String model; // 车型
    private String speed; // 最高速度
    private String braking; // 制动性

    public CarConfiguration(Builder builder) {
        this.color = builder.color;
        this.model = builder.model;
        this.speed = builder.speed;
        this.braking = builder.braking;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getBraking() {
        return braking;
    }

    public void setBraking(String braking) {
        this.braking = braking;
    }

    @Override
    public String toString() {
        return "CarConfiguration{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                ", braking='" + braking + '\'' +
                '}';
    }

    public static class Builder{
        private String color; // 颜色
        private String model; // 车型
        private String speed; // 最高速度
        private String braking; // 制动性

        public Builder buildColor(String color){
            this.color = color;
            return this;
        }

        public Builder buildModel(String model){
            this.model = model;
            return this;
        }
        public Builder buildSpeed(String speed){
            this.speed = speed;
            return this;
        }
        public Builder buildBraking(String braking){
            this.braking = braking;
            return this;
        }
        public CarConfiguration build(){
            return new CarConfiguration(this);
        }

    }
}
