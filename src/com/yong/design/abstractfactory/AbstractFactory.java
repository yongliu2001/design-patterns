package com.yong.design.abstractfactory;

import com.yong.design.domain.color.Color;
import com.yong.design.domain.shape.Shape;

/**
 * Created by yongliu on 7/5/2018.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
