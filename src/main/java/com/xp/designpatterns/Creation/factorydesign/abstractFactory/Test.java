package com.xp.designpatterns.Creation.factorydesign.abstractFactory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;

public class Test {
    public static void main(String[] args) {
        System.out.println("抽象工厂模式");
        MerchantFactory merchantFactory = new MerchantFactory();
        Customer customer = merchantFactory.createCustomer("zhang", "M");
        CustomerExt customerExt = merchantFactory.createCustomerExt();
        System.out.println(customer);
        System.out.println(customerExt);

        BankPatnerFactory bankPatnerFactory = new BankPatnerFactory();
        Customer customer1 = bankPatnerFactory.createCustomer("zhang", "B");
        CustomerExt customerExt1 = bankPatnerFactory.createCustomerExt();
        System.out.println(customer1);
        System.out.println(customerExt1);

        AgentFactory agentFactory = new AgentFactory();
        Customer customer2 = agentFactory.createCustomer("zhang", "A");
        CustomerExt customerExt2 = agentFactory.createCustomerExt();
        System.out.println(customer2);
        System.out.println(customerExt2);

    }
}
