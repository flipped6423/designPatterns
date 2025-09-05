package com.xp.designpatterns.behavioral.templateMethod;

import com.xp.designpatterns.behavioral.strategyDesign.Order;
import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

/**
 * 微信支付
 */
public class WechatPay extends AbstractPayment{
    @Override
    protected void checkPaymentResult(PayResult payResult) {
        System.out.println("微信支付-检查支付结果开始");
    }

    @Override
    protected PayResult callpaymentchannel(Order order) {
        System.out.println("微信支付-调用支付渠道开始");
        return null;
    }

    @Override
    protected void preparePaymentChannel(Order order) {
        System.out.println("微信支付-准备支付渠道开始");

    }
}
