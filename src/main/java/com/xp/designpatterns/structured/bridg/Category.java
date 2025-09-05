package com.xp.designpatterns.structured.bridg;

/**
 * 分类抽象类
 */
public abstract class Category {

    /**
     * 桥接的形状对象
     */
    protected Shap shap;

    public Category(Shap shap) {
        this.shap = shap;
    }

    /**
     * 抽象方法
     */
    public abstract String draw();
}
