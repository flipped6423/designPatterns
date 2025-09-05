package com.xp.designpatterns.structured.adapter;


import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

/**
 * 创建设配器类
 * 银联支付
 */
public class UnionPayAdapter implements IPayment {

    private UnionPayAPI unionPayAPI = new UnionPayAPI();
    @Override
    public PayResult pay(Order order) {
        return unionPayAPI.pay(order);
    }
}
