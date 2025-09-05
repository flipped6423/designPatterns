package com.xp.designpatterns.structured.adapter;


import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

/**
 * 具体支付方式（被适配者）
 * 微信支付API
 */
public class WechatPayAPI {
    public PayResult pay(Order order) {
        return new PayResult("微信支付成功" +order);
    }
}
