package com.xp.designpatterns.behavioral.chanofResponsibility;

/**
 * 支付客户端
 */
public class PaymentClient {
    public static void main(String[] args) {
        //创建责任链处理器
        WechatPayHandler wechatPayHandler = new WechatPayHandler();
        AliPayHandler aliPayHandler = new AliPayHandler();
        CreditCardHandler creditCardHandler = new CreditCardHandler();

        //设置支付责任链
        wechatPayHandler.setNextHandler(aliPayHandler);
        aliPayHandler.setNextHandler(creditCardHandler);

        //模拟支付宝支付请求
        System.out.println("模拟支付宝支付请求");
        wechatPayHandler.handleRequest(new PaymentRequest(2));
        System.out.println("-------------------------------");

        //模拟微信支付请求
        System.out.println("模拟微信支付请求");
        wechatPayHandler.handleRequest(new PaymentRequest(1));
        System.out.println("-------------------------------");

        //模拟信用卡支付请求
        System.out.println("模拟信用卡支付请求");
        wechatPayHandler.handleRequest(new PaymentRequest(3));
        System.out.println("-------------------------------");


    }
}
