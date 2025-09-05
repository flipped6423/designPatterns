package com.xp.designpatterns.structured.Proxy.dynamicProxy.jdkProxy;

import com.xp.designpatterns.structured.Proxy.staticProxy.User;

public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        JdkDynamicProxy.getUserProxy().saveUser(user);
    }
}
