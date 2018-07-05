package com.yong.design.factory;

import com.yong.design.domain.shape.Shape;

/**
 *
 * Factory pattern is one of the most used design patterns in Java. This type of design pattern comes
 * under creational pattern as this pattern provides one of the best ways to create an object.
 *
 * In Factory pattern, we create object without exposing the creation logic to the client and refer
 * to newly created object using a common interface.
 *
 * Implementation
 * We're going to create a Shape interface and concrete classes implementing the Shape interface.
 * A factory class ShapeFactory is defined as a next step.
 *
 * FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object.
 * It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.
 *
 * Created by yongliu on 7/5/2018.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

    }
}
