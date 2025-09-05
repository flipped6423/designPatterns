package com.xp.designpatterns.Creation.factorydesign.factory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;

public class Test {
    public static void main(String[] args) {
        System.out.println("--------------工厂模式-工厂方法--------------");

        Customer customer = new MerchantFactory().create("商户1", "M");
        System.out.println(customer);

        Customer customer1 = new BankPartnerFactory().create("银行1", "B");
        System.out.println(customer1);

        Customer customer2 = new AgentFactory().create("代理商1", "A");
        System.out.println(customer2);
    }
}
