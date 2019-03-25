package com.design.mode.singleton;


/**
 *  懒汉式
 *      延迟加载对象
 */
public class LazySingleton2 {

    private static LazySingleton2 instance = null;

    private LazySingleton2(){}

    /**
     *  在方法上添加锁，属于类锁, 我们可以优化下该方法，使用双重检查锁
     * @return
     */
    public static LazySingleton2 getInstance(){
        // 首先判断实例是否为空，如果不为空则直接返回实例对象，这样就不用进入同步锁,减少线程等待的时间
        if (instance == null){
            synchronized (LazySingleton2.class){
                // 因为在上面判断实例是否为空时，没有在锁，可以有多个线程进入该代码，所以需要重新判断实例是否为空
                if (instance == null){
                    instance = new LazySingleton2();
                }
            }
        }
        return instance;
    }
}
