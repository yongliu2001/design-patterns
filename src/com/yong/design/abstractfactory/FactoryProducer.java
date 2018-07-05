package com.yong.design.abstractfactory;

/**
 * Created by yongliu on 7/5/2018.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
