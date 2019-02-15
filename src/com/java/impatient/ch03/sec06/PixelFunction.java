package com.java.impatient.ch03.sec06;

import java.awt.Color;

/**
 * 自定义函数接口
 * @author
 * @date
 */
@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}