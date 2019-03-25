package com.design.mode.singleton;

public class LazyTest {

    public static void main(String[] args) {
        new Thread(new LazyThread()).start();
        new Thread(new LazyThread()).start();
        System.out.println("测试结束");
    }

    private static class LazyThread implements Runnable{

        public void run() {
            LazySingleton lazySingleton = LazySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + lazySingleton);
        }
    }

}
