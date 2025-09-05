package com.xp.designpatterns.behavioral.templateMethod;

import com.xp.designpatterns.behavioral.strategyDesign.IPayment;
import com.xp.designpatterns.behavioral.strategyDesign.Order;
import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

/**
 * 模板方法模式-抽象支付类
 * 定义抽象类
 */
public abstract class AbstractPayment implements IPayment {
    /**
     * 支付方法（模板方法）
     */
    @Override
    public PayResult pay(Order order){
        //校验支付参数
        checkPaymentData( order);

        //风控检查
        checkRiskControl( order);

        //准备支付渠道（子类实现）
        preparePaymentChannel( order);

        //调用支付渠道（子类实现）
        PayResult payResult = callpaymentchannel( order);

        //校验支付结果（子类实现）
        checkPaymentResult( payResult);

        //发送支付结果通知
        sendPaymentResultNotification(payResult);

        return payResult;
    }

    /**
     * 发送支付结果通知
     * @param payResult
     */
    private void sendPaymentResultNotification(PayResult payResult) {
        System.out.println("发送支付结果通知");
    }

    /**
     * 校验支付结果（子类实现）
     * @param payResult
     */
    protected abstract void checkPaymentResult(PayResult payResult);

    /**
     * 调用支付渠道(子类实现)
     * @param order
     * @return
     */
    protected abstract PayResult callpaymentchannel(Order order);

    /**
     * 准备支付渠道（子类实现）
     * @param order
     */
    protected abstract void preparePaymentChannel(Order order);

    /**
     * 风控检查
     * @param order
     */
    protected final void checkRiskControl(Order order) {
        System.out.println("风控检查");
    }

    /**
     * 校验支付参数
     * @param order
     */
    protected final void checkPaymentData(Order order) {
        System.out.println("校验支付参数");
    }

}
