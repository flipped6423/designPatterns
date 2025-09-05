package com.xp.designpatterns.structured.decorator;

/**
 * 墙面装饰器角色实现（刮腻子）
 */
public class WallBeautifyPutty extends WallBeautifyDecorator{

    public WallBeautifyPutty(WallBeautify wallBeautify) {
        super(wallBeautify);
    }

    @Override
    public void decoration() {
        System.out.println("使用腻子进行装饰");
    }
}
