package com.xp.designpatterns.Creation.factorydesign.abstractFactory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;
import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Merchant;

/**
 * 商户工厂
 */
public class MerchantFactory implements CustomerFactory{
    @Override
    public Customer createCustomer(String name, String type) {
        return new Merchant(name,type);
    }

    @Override
    public CustomerExt createCustomerExt() {
        return new MerchantExt();
    }
}
