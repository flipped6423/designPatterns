package com.xp.designpatterns.behavioral.strategyDesign;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回结果类
 */
@Data
@AllArgsConstructor
public class PayResult {
    /**
     * 支付结果
     */
    private String result;
}
