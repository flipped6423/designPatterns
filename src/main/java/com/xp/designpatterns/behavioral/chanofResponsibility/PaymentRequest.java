package com.xp.designpatterns.behavioral.chanofResponsibility;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 支付请求
 */
@Data
@RequiredArgsConstructor
public class PaymentRequest {

    /**
     * 支付类型。1-WechatPay，2-Alipay 3-Creditcard
     */
    final int type;
}
