package com.design.mode.facade;

public class Test {


    public static void main(String[] args) {
        GoodFacade goodFacade = new GoodFacade();
        goodFacade.setAuthServer(new AuthServer());
        goodFacade.setPayServer(new PayServer());
        goodFacade.setLogisticsServer(new LogisticsServer());

        Good good = new Good("小米10");
        goodFacade.buy(good);
    }

}

