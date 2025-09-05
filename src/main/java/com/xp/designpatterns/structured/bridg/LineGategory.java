package com.xp.designpatterns.structured.bridg;

/**
 * 线条分类
 */
public class LineGategory extends  Category{
    public LineGategory(Shap shap) {
        super(shap);
    }

    @Override
    public String draw() {
        return "线条分类，绘制：" + shap.draw();
    }
}
