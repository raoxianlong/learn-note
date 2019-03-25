package com.design.mode.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class HungryTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 序列化攻击
        /*HungrySingleton singleton = HungrySingleton.getInstance();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ser_file"));
        out.writeObject(singleton);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("ser_file"));
        HungrySingleton newSingleton = (HungrySingleton) in.readObject();

        System.out.println(singleton == newSingleton);*/
        // 反射攻击
        Class clz = HungrySingleton.class;
        HungrySingleton singleton = HungrySingleton.getInstance();
        Constructor constructor = clz.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton newSingleton = (HungrySingleton) constructor.newInstance();

        System.out.println(singleton);
        System.out.println(newSingleton);
        System.out.println(newSingleton == singleton);
    }
}
