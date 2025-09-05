package com.xp.designpatterns.structured.adapter;

import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

/**
 * 创建设配器类
 * 支付包支付
 */
public class AliPayAdapter implements IPayment {

    private AliPayAPI  aliPayAPI = new AliPayAPI();
    @Override
    public PayResult pay(Order order) {
        return aliPayAPI.pay(order);
    }
}
