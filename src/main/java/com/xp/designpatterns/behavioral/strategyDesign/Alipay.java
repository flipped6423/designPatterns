package com.xp.designpatterns.behavioral.strategyDesign;

import org.springframework.stereotype.Service;

/**
 * 支付宝
 */
@Service("Alipay")
public class Alipay implements IPayment{
    @Override
    public PayResult pay(Order order) {
        return new PayResult("支付宝支付成功");
    }
}
