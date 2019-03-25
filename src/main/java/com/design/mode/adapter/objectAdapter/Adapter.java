package com.design.mode.adapter.objectAdapter;

public class Adapter implements Target{

    DelegationAdapter adapter = new DelegationAdapter();

    @Override
    public void request() {
        adapter.request();
    }
}
