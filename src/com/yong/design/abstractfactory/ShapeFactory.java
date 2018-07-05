package com.yong.design.abstractfactory;

import com.yong.design.domain.color.Color;
import com.yong.design.domain.shape.Circle;
import com.yong.design.domain.shape.Rectangle;
import com.yong.design.domain.shape.Shape;
import com.yong.design.domain.shape.Square;

/**
 * Created by yongliu on 7/5/2018.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }
}
