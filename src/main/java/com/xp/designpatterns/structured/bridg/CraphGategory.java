package com.xp.designpatterns.structured.bridg;

/**
 * 图形分类
 */
public class CraphGategory extends  Category{
    public CraphGategory(Shap shap) {
        super(shap);
    }

    @Override
    public String draw() {
        return "图形分类，绘制：" + shap.draw();
    }
}
