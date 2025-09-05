package com.xp.designpatterns.Creation.factorydesign.abstractFactory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Agent;
import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;

public class AgentFactory implements CustomerFactory{
    @Override
    public Customer createCustomer(String name, String type) {
        return new Agent(name,type);
    }

    @Override
    public CustomerExt createCustomerExt() {
        return new AgentExt();
    }
}
