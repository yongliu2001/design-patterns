package com.yong.design.abstractfactory;

import com.yong.design.domain.color.Color;
import com.yong.design.domain.shape.Shape;

/**
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories. This type of design pattern comes under creational pattern
 * as this pattern provides one of the best ways to create an object.
 *
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects without
 * explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
 *
 * Implementation
 *
 * We are going to create a Shape and Color interfaces and concrete classes implementing these interfaces.
 * We create an abstract factory class AbstractFactory as next step. Factory classes ShapeFactory and ColorFactory
 * are defined where each factory extends AbstractFactory. A factory creator/generator class FactoryProducer is created.
 * AbstractFactoryPatternDemo, our demo class uses FactoryProducer to get a AbstractFactory object.
 *
 * It will pass information (CIRCLE / RECTANGLE / SQUARE for Shape) to AbstractFactory to get the type of object it needs.
 * It also passes information (RED / GREEN / BLUE for Color) to AbstractFactory to get the type of object it needs.
 *
 * Created by yongliu on 7/5/2018.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        red.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();


    }
}
