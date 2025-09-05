package com.xp.designpatterns.structured.decorator;

/**
 * 墙面装修装饰器角色实现类（涂油漆）
 */
public class WallBeautifyPaint extends WallBeautifyDecorator{
    public WallBeautifyPaint(WallBeautify wallBeautify) {
        super(wallBeautify);
    }

    @Override
    public void decoration() {
        System.out.println("涂油漆");
    }
}
