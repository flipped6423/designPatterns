package com.xp.designpatterns.Creation.factorydesign.abstractFactory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.BankPartner;
import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;

/**
 * 银行客户工厂
 */
public class BankPatnerFactory implements CustomerFactory{
    @Override
    public Customer createCustomer(String name, String type) {
        return new BankPartner(name,type);
    }

    @Override
    public CustomerExt createCustomerExt() {
        return new BankPartnerExt();
    }
}
