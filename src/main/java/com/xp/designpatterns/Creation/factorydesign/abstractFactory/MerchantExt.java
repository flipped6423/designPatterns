package com.xp.designpatterns.Creation.factorydesign.abstractFactory;

import lombok.Data;
import lombok.ToString;

/**
 * 商户扩展类
 */
@Data
@ToString(callSuper = true)
public class MerchantExt extends CustomerExt{
    /**
     * 介绍人
     */
    private int introduceName;

    /**
     * 介绍人电话
     */
    private String introduceTel;
}
