package com.yong.design.decorator;

import com.yong.design.domain.shape.Circle;
import com.yong.design.domain.shape.Rectangle;
import com.yong.design.domain.shape.Shape;

/**
 * Created by yongliu on 6/7/18.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with red border");
        redCircle.draw();

        System.out.println("Rectangle with red border");
        redRectangle.draw();

    }
}
