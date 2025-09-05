package com.xp.designpatterns.structured.adapter;


import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

public class test {
    public static void main(String[] args) {
        PayResult pay = new AliPayAdapter().pay(new Order(31, "alipay"));
        System.out.println(pay);

        PayResult pay1 = new WechatPayAdapter().pay(new Order(31, "wechat"));
        System.out.println(pay1);

        PayResult pay2 = new UnionPayAPI().pay(new Order(31, "union"));
        System.out.println(pay2);

    }
}
