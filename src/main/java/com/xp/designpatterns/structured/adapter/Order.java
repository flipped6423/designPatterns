package com.xp.designpatterns.structured.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 订单信息
 */
@Data
@AllArgsConstructor
public class Order {

    /**
     * 金额
     */
    private int amount;

    /**
     * 支付类型
     */
    private String paymentType;
}
