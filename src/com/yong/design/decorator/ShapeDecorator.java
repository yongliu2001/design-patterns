package com.yong.design.decorator;

import com.yong.design.domain.shape.Shape;

/**
 * Created by yongliu on 6/7/18.
 */
public abstract class ShapeDecorator implements Shape {


    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
