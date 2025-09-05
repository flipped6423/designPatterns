package com.xp.designpatterns.Creation.factorydesign.abstractFactory;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户扩展基类
 */
@Data
@NoArgsConstructor
public abstract class CustomerExt {

    /**
     * 客户层用名
     */
    private String formerName;

    /**
     * 客户扩展说明
     */
    private String note;
}
