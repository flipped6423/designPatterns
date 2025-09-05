package com.xp.designpatterns.structured.adapter;


import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

/**
 * 具体支付方式（被适配者）
 * 银连支付API
 */
public class UnionPayAPI {
    public PayResult pay(Order order) {
        return new PayResult("银连支付成功" +order);
    }
}
