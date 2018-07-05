package com.yong.design.abstractfactory;

import com.yong.design.domain.color.Blue;
import com.yong.design.domain.color.Color;
import com.yong.design.domain.color.Green;
import com.yong.design.domain.color.Red;
import com.yong.design.domain.shape.Shape;

/**
 * Created by yongliu on 7/5/2018.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
