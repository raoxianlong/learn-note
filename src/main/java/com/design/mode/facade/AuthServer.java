package com.design.mode.facade;

/**
 *  资格认证服务
 */
public class AuthServer {


    public boolean auth(Good good){
        System.out.println("资格验证通过，可以购买商品: 【" + good.getName() + "】");
        return true;
    }


}
