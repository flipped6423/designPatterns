package com.xp.designpatterns.structured.Proxy.dynamicProxy.jdkProxy;

import com.xp.designpatterns.structured.Proxy.staticProxy.User;

/**
 * 用户接口实现类
 */
public class UserInterfaceImpl implements UserInterface{
    @Override
    public boolean saveUser(User user) {
        System.out.println("保存用户：" + user.getName());
        return true;
    }
}
