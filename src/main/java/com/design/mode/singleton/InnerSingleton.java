package com.design.mode.singleton;

/**
 *  使用内部类实现单例
 */
public class InnerSingleton {

    private InnerSingleton(){}

    private static class SingletonObj{
        private static InnerSingleton innerSingleton = new InnerSingleton();
    }

    public static InnerSingleton getInstance(){
        return SingletonObj.innerSingleton;
    }

}
