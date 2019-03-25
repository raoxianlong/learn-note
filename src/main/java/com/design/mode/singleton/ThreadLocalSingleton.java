package com.design.mode.singleton;

public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> LOCAL = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return LOCAL.get();
    }

    public static void main(String[] args) {
        Runnable runnable = () -> {
                System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }


}
