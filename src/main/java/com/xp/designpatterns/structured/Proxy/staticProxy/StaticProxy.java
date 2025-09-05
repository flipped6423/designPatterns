package com.xp.designpatterns.structured.Proxy.staticProxy;

/**
 * 静态代理类
 */
public class StaticProxy implements UserInterface{


    private final UserInterface userInterface;

    public StaticProxy(UserInterface userInterface){
        this.userInterface = userInterface;
    }
    @Override
    public boolean saveUser(User user) {
        System.out.println("静态代理-开始保存用户");
        boolean result = userInterface.saveUser(user);
        System.out.println("静态代理-保存用户结束"+result);
        System.out.println();
        return result;
    }
}
