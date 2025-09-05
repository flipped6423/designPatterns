package com.xp.designpatterns.structured.adapter;


import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

/**
 * 具体支付方式（被适配者）
 * 支付宝支付API
 */
public class AliPayAPI {
    public PayResult pay(Order order) {
        return new PayResult("支付宝支付成功" +order);
    }
}
