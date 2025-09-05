package com.xp.designpatterns.behavioral.strategyDesign;

import org.springframework.stereotype.Service;

/**
 * 微信支付
 */
@Service("WechatPay")
public class WechatPay implements IPayment{
    @Override
    public PayResult pay(Order order) {
        return new PayResult("微信支付成功");
    }
}
