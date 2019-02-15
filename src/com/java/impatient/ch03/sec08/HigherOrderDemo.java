package com.java.impatient.ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 高阶函数：处理或返回函数的函数称为高阶函数
 * @ClassName HigherOrderDemo
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-06 20:40
 * @Version 1.0
 */
public class HigherOrderDemo {
    /**
     * 返回函数的方法
     * 根据参数返回排序函数，参数：1是升序函数，-1是降序函数
     * @param direction 参数
     * @return 排序函数
     */
    public static Comparator<String> compareInDirecton(int direction) {
        return (x, y) -> direction * x.compareTo(y);
    }

    /**
     * 修改函数的方法
     * 接受一个函数，并返回一个修改后的函数
     * @param comp
     * @return
     */
    public static Comparator<String> reverse(Comparator<String> comp) {
        return (x, y) -> comp.compare(x, y);
    }
    
    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Arrays.sort(words, compareInDirecton(-1));
        System.out.println(Arrays.toString(words));

        //大小写不敏感排序
        Arrays.sort(words, reverse(String::compareToIgnoreCase));

        System.out.println(Arrays.toString(words));        
    }
}
