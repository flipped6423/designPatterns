package com.xp.designpatterns.behavioral.strategyDesign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用策略
 */
@RestController
public class PayService {
    @Autowired
    private ApplicationContext applicationContext;

    public PayResult pay(@RequestParam("amount") int amount,@RequestParam("paymentType") String paymentType){
        Order order = new Order();
        order.setAmount(amount);
        order.setPaymentType(paymentType);

        //根据支付类型获取对应的策略bean
        IPayment bean = applicationContext.getBean(order.getPaymentType(), IPayment.class);

        //开始支付
        PayResult pay = bean.pay(order);
        return pay;
    }
}
