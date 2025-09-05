package com.xp.designpatterns.structured.bridg;

public class Test {
    public static void main(String[] args) {
        //绘制图形
        draw(new CraphGategory(new Circle()));

        //绘制长方形
        draw(new CraphGategory(new Rectangle()));

        //绘制曲线
        draw(new LineGategory(new CurvedLine()));

        //绘制直线
        draw(new LineGategory(new StraightLine()));
    }

    private static void draw(Category category) {
        String draw = category.draw();
        System.out.println(draw);
    }
}
