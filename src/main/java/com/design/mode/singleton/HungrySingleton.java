package com.design.mode.singleton;

import java.io.Serializable;

/**
 *  饿汉式
 *     - 实例初始化之前就创建对象
 *
 *    优点：
 *       不用考虑线程安全问题
 *    缺点：
 *       在不用的情况下, 增加了内存消耗
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private HungrySingleton(){};

    private HungrySingleton readResolve(){
        return hungrySingleton;
    }

}
