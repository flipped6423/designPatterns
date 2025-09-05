package com.xp.designpatterns.Creation.factorydesign.abstractFactory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;

/**
 * 抽象工厂客户接口
 */
public interface CustomerFactory {
    Customer createCustomer(String name, String type);

    CustomerExt createCustomerExt();
}
