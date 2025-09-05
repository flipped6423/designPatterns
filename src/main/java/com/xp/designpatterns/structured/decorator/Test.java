package com.xp.designpatterns.structured.decorator;

public class Test {
    public static void main(String[] args) {
        //清理墙面
        new WallBeautifyClean().operation();
        System.out.println("--------------------------");

        //刮腻子
        new WallBeautifyPutty(new WallBeautifyClean()).operation();
        System.out.println("--------------------------");

        //粉刷
        new WallBeautifyPaint(new WallBeautifyPutty(new WallBeautifyClean())).operation();
        System.out.println("--------------------------");

        //挂画
        new WallBeautifyfyHang(new WallBeautifyPaint(new WallBeautifyPutty(new WallBeautifyClean()))).operation();
        System.out.println("--------------------------");
    }
}
