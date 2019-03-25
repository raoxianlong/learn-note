package com.design.mode.singleton;


import java.util.HashMap;
import java.util.Map;

/**
 *  容器单例
 *
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String, Object> container = new HashMap<String, Object>();

    public void pushInstance(String key, Object object){
        if (key != null && key.trim() != "" && object != null && !container.containsKey(key)){
            container.put(key, object);
        }
    }

    public Object getInstance(String key){
        if (key != null){
           return container.get(key);
        }
        return null;
    }

}
