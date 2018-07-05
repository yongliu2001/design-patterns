package com.yong.design.domain.color;

/**
 * Created by yongliu on 7/5/2018.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
