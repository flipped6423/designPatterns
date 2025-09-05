package com.xp.designpatterns.behavioral.strategyDesign;

import org.springframework.stereotype.Service;

/**
 * 云闪付
 */
@Service("UnionPay")
public class UnionPay implements IPayment{
    @Override
    public PayResult pay(Order order) {
        return new PayResult("云闪付支付成功");
    }
}
