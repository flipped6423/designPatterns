package com.xp.designpatterns.Creation.factorydesign.factory;

import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Agent;
import com.xp.designpatterns.Creation.factorydesign.simpleFactory.Customer;

/**
 * 代理商工厂
 */
public class AgentFactory implements CustomerFactory{
    @Override
    public Customer create(String name, String type) {
        return new Agent(name, type);
    }
}
