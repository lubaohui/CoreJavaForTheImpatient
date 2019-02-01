package com.java.impatient.ch03.sec04;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {

        String[] friends = { "Peter", "Paul", "Mary" };
        /**
         * 数组排序，使用lambda表达式，判断元素长度排序
         */
        Arrays.sort(friends,
                (first, second) -> first.length() - second.length());

        System.out.println(Arrays.toString(friends));

        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));

        /**
         * list中空移除元素，使用lambda表达式，判断空元素。
         */
        enemies.removeIf(e -> e == null);

        System.out.println(enemies);
    }
}
