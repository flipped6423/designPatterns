package com.xp.designpatterns.behavioral.chanofResponsibility;

/*
支付宝处理器
 */
public class AliPayHandler extends PaymentHandler{
    public AliPayHandler() {
        super(2);
    }

    @Override
    protected void process(PaymentRequest request) {
        System.out.println("支付宝支付");
    }
}
