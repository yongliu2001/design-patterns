package com.yong.design.factory;

import com.yong.design.domain.shape.Circle;
import com.yong.design.domain.shape.Rectangle;
import com.yong.design.domain.shape.Shape;
import com.yong.design.domain.shape.Square;

/**
 * Created by yongliu on 7/5/2018.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
