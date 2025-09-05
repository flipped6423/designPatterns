package com.xp.designpatterns.structured.decorator;

/**
 * 墙面装修装饰器角色实现类-挂画
 */
public class WallBeautifyfyHang extends WallBeautifyDecorator{
    public WallBeautifyfyHang(WallBeautify wallBeautify) {
        super(wallBeautify);
    }

    @Override
    public void decoration() {
        System.out.println("挂画");
    }
}
