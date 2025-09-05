package com.xp.designpatterns.Creation.factorydesign.factory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;
import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Merchant;

/**
 * 商户工厂
 */
public class MerchantFactory implements CustomerFactory{
    @Override
    public Customer create(String name, String type) {
        return new Merchant(name, type);
    }
}
