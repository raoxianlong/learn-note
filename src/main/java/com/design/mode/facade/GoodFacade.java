package com.design.mode.facade;

public class GoodFacade {

    private LogisticsServer logisticsServer;
    private PayServer payServer;
    private AuthServer authServer;

    /**
     *  买商品
     */
    public void buy(Good good){
        if (authServer.auth(good)){
            payServer.pay(good); // 支付
            logisticsServer.send(good); // 发送快递
        }
    }

    public LogisticsServer getLogisticsServer() {
        return logisticsServer;
    }

    public void setLogisticsServer(LogisticsServer logisticsServer) {
        this.logisticsServer = logisticsServer;
    }

    public PayServer getPayServer() {
        return payServer;
    }

    public void setPayServer(PayServer payServer) {
        this.payServer = payServer;
    }

    public AuthServer getAuthServer() {
        return authServer;
    }

    public void setAuthServer(AuthServer authServer) {
        this.authServer = authServer;
    }
}
