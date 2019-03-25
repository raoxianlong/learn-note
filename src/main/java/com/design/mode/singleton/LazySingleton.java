package com.design.mode.singleton;


/**
 *  懒汉式
 *      延迟加载对象
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){}

    /**
     *  在方法上添加锁，属于类锁
     * @return
     */
    public synchronized static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
