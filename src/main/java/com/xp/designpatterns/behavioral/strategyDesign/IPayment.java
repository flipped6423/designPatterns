package com.xp.designpatterns.behavioral.strategyDesign;

/**
 * 策略接口：支付接口
 */
public interface IPayment {
    /**
     * 支付
     */

    PayResult pay(Order order);
}
