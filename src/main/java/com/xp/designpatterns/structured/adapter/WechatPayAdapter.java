package com.xp.designpatterns.structured.adapter;


import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

/**
 * 创建设配器类
 * 微信支付
 */
public class WechatPayAdapter implements IPayment {

    private WechatPayAPI wechatPayAPI = new WechatPayAPI();
    @Override
    public PayResult pay(Order order) {
        return wechatPayAPI.pay(order);
    }
}
