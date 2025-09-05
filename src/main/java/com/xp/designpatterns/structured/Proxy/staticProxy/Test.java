package com.xp.designpatterns.structured.Proxy.staticProxy;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        new StaticProxy(new UserInterfaceImpl()).saveUser(user);
    }
}
