package com.xp.designpatterns.structured.Proxy.dynamicProxy.jdkProxy;

import com.xp.designpatterns.structured.Proxy.staticProxy.UserInterface;

import java.lang.reflect.InvocationHandler;

/**
 * jdk动态代理类
 */
public class JdkDynamicProxy {

    private static final InvocationHandler USER_HANDLE = (proxy,method,args)->{
        System.out.println("JDK动态代理-开始保存用户");
        Object result = method.invoke(new UserInterfaceImpl(), args);
        System.out.println("JDK动态代理-保存用户结束"+result);
        System.out.println();
        return result;
    };

    public static UserInterface getUserProxy(){
        return (UserInterface) java.lang.reflect.Proxy.newProxyInstance(JdkDynamicProxy.class.getClassLoader(),
                new Class[]{UserInterface.class},USER_HANDLE);
    }
}
