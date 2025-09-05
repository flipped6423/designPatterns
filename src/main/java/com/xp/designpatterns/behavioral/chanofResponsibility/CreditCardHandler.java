package com.xp.designpatterns.behavioral.chanofResponsibility;

public class CreditCardHandler extends PaymentHandler{
    public CreditCardHandler() {
        super(3);
    }

    @Override
    protected void process(PaymentRequest request) {
        System.out.println("使用信用卡支付");
    }
}
