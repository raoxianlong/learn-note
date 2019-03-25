package com.design.mode.adapter.classAdapter;

/**
 *  类适配器，是基于继承实现的。
 */
public class ClassAdapter extends OutTarget implements Target{

    @Override
    public void request() {
        // 转换
        super.request0();
    }
}
