package com.design.mode.singleton;

import java.io.*;

public class EnumTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 使用枚举可以防止序列化攻击
        Enum e = Enum.INSTANCE;
        Singleton singleton = new Singleton();
        e.setSingleton(singleton);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ser_file"));
        out.writeObject(e);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("ser_file"));
        Enum newE = (Enum) in.readObject();

        System.out.println(e);
        System.out.println(newE);
        System.out.println(e == newE);
        // 反射攻击



    }
}
