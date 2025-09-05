package com.xp.designpatterns.structured.adapter;


import com.xp.designpatterns.behavioral.strategyDesign.PayResult;

/**
 * 创建目标接口  支付接口
 */
public interface IPayment {
    PayResult pay(Order  order);
}
