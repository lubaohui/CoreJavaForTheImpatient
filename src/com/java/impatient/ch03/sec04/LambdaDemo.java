package com.java.impatient.ch03.sec04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author
 * @date
 */
public class LambdaDemo {
    public static void main(String[] args) {

        String[] friends = { "Peter", "Paul", "Mary" };
        /**
         * 数组排序，使用lambda表达式，判断元素长度排序
         * 参数类型可以被推到出来，可以忽略类型。
         */
        Arrays.sort(friends,
                (first, second) -> first.length() - second.length());

        /**
         * 复杂写法
         */
        Arrays.sort(friends,(String first, String second) -> {
            int difference = first.length() - second.length();

            if(difference < 0) {
                return  -1;
            } else if (difference > 0) {
                return  1;
            } else {
                return 0;
            }

        });

        System.out.println(Arrays.toString(friends));

        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));

        /**
         * list中空移除元素，使用lambda表达式，判断空元素。
         */
        enemies.removeIf(e -> e == null);

        System.out.println(enemies);


        Runnable task = () -> {
            for (int i=0; i<1000; i++){
                //doWork();
            }
        };

        /**
         *
         */

        /*EventHandler<ActionEvent> listener = event ->
                System.out.println("Oh noes!");
        */

        /**
         * 方法引用，::
         */

        Arrays.sort(friends,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(friends));

        //方法引用，判断对象是null
        enemies.removeIf(Objects::isNull);

        enemies.forEach(System.out::println);

        /**
         * 构造方法引用，
         */

        List<String> names;

        //Stream<Employee> stream = names.stream().map(Employee::new);

    }
}
