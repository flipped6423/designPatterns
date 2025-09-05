package com.xp.designpatterns.Creation.factorydesign.abstractFactory;

import lombok.Data;
import lombok.ToString;

/**
 * 银行客户扩展
 */
@Data
@ToString(callSuper = true)
public class BankPartnerExt extends CustomerExt {
    /**
     * 分行个数
     */
    private int branchCount;

    /**
     * ATM个数
     */
    private int atmCount;
}
