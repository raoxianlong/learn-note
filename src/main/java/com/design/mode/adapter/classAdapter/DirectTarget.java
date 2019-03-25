package com.design.mode.adapter.classAdapter;

public class DirectTarget implements Target{

    @Override
    public void request() {
        System.out.println("请求成功! - 1");
    }
}
