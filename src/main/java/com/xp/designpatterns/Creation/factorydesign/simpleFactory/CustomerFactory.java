package com.xp.designpatterns.Creation.factorydesign.simpleFactory;

/**
 * 客户简单工厂
 */
public class CustomerFactory {

    private static Merchant createMerchant(String name,String type){
        return new Merchant(name,type);
    }
    private static BankPartner createBankPartner(String name,String type){
        return new BankPartner(name,type);
    }
    private static Agent createAgent(String name,String type){
        return new Agent(name,type);
    }

    public static Customer create(String name,String type){
        return switch (type) {
            case "M" -> createMerchant(name, type);
            case "B" -> createBankPartner(name, type);
            case "A" -> createAgent(name, type);
            default -> null;
        };
    }

}
