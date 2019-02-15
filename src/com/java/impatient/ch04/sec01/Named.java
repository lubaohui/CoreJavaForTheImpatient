package com.java.impatient.ch04.sec01;

/**
 * 
 * @ClassName Named
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 16:43
 * @Version 1.0
 */
public interface Named {
    /**
     * 返回姓名
     * @return 姓名
     */
    default String getName() { return ""; }
}