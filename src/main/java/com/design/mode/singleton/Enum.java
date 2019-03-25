package com.design.mode.singleton;

public enum Enum {

    INSTANCE;

    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void setSingleton(Singleton singleton) {
        Enum.singleton = singleton;
    }

}


class Singleton{


}