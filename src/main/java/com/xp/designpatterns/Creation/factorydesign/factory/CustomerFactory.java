package com.xp.designpatterns.Creation.factorydesign.factory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;

/**
 * 工厂方法客户接口
 */
public interface CustomerFactory {
    Customer create(String name,String type);
}
