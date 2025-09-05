package com.xp.designpatterns.structured.decorator;

/**
 * 墙面装修装饰器角色
 */
public abstract class WallBeautifyDecorator implements WallBeautify{

    /**
     * 持有一个Component
     */
    private WallBeautify wallBeautify;

    public WallBeautifyDecorator(WallBeautify wallBeautify) {
        this.wallBeautify = wallBeautify;
    }
    @Override
    public void operation() {
        wallBeautify.operation();
        decoration();
    }

    /**
     *装饰器实现类自定义实现方法
     */
    public abstract void decoration();
}
