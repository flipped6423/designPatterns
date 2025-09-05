package com.xp.designpatterns.Creation.factorydesign.simpleFactory;

public class Test {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.create("张1","M");
        System.out.println(customer);

        Customer customer1 = CustomerFactory.create("张2","A");
        System.out.println(customer1);

        Customer customer2 = CustomerFactory.create("张3","B");
        System.out.println(customer2);
    }
}
