package com.xp.designpatterns.behavioral.chanofResponsibility;

/**
 * 微信支付处理器
 */
public class WechatPayHandler extends PaymentHandler{

    public WechatPayHandler() {
        super(1);
    }

    @Override
    protected void process(PaymentRequest request) {
        System.out.println("微信支付");

    }
}
