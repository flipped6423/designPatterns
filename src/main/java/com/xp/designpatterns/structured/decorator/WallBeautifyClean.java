package com.xp.designpatterns.structured.decorator;

/**
 * 组件接口的基本实现类
 * 墙面装修基本实现（清理墙面）
 */
public class WallBeautifyClean implements WallBeautify{
    @Override
    public void operation() {
        System.out.println("清理墙面");
    }
}
