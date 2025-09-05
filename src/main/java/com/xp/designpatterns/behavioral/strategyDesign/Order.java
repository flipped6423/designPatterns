package com.xp.designpatterns.behavioral.strategyDesign;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 订单信息
 */
@Data
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
