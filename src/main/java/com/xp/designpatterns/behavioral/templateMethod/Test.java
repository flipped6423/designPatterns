package com.xp.designpatterns.behavioral.templateMethod;

import com.xp.designpatterns.behavioral.strategyDesign.Order;
import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setAmount(100);
        order.setPaymentType("WechatPay");

        new WechatPay().pay(order);
    }
}
