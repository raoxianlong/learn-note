package com.design.mode.facade;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  支付服务
 */
public class PayServer {

    /**
     *  支付
     * @param good
     * @return
     */
    public String pay(Good good){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())  + " 商品：【" + good.getName() + "】支付成功.");
        return Integer.toHexString(231340);
    }


}
