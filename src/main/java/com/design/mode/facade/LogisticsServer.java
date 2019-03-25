package com.design.mode.facade;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  物流服务
 */
public class LogisticsServer {

    /**
     *  发送快递
     * @param good
     * @return 快递编号
     */
    public String send(Good good){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " 快件: 【" + good.getName() + "】已收揽." );
        System.out.println("快递编号:" + Integer.toHexString(1354));
        return Integer.toHexString(1354);
    }

}
