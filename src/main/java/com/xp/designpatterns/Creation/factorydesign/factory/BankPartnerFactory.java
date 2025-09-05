package com.xp.designpatterns.Creation.factorydesign.factory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.BankPartner;
import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;

/**
 * 银行客户工厂
 */
public class BankPartnerFactory implements CustomerFactory{
    @Override
    public Customer create(String name, String type) {
        return new BankPartner(name, type);
    }
}
