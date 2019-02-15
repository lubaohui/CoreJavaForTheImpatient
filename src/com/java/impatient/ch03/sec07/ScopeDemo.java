package com.java.impatient.ch03.sec07;

/**
 * lambda表达式和变量作用域
 * @author
 * @date
 */
public class ScopeDemo {

    public static void main(String[] args) {
        repeatMessage("Hello", 10);

        for (String a : args) {
            new Thread(() -> System.out.println(a));
        }
    }

    /**
     * 线程多次输出信息
     * 闭合作用域的变量，lambda表达式访问方法体重的参数
     * @param text 信息体
     * @param count 次数
     */
    public static void repeatMessage(String text, int count) {

        //lambda表达式是闭包：带有自由变量的代码块。
        //约束：lambda表达式只能捕获那些不变的变量，只是捕获变量值，不是捕获变量。
        Runnable r = () -> {
            //count和text作为，ldmbda表达式中的自由变量
            //自由变量：不是参数变量，也不是内部定义的变量
           for (int i = 0; i < count; i++) {
              System.out.println(text);
           }
        };
        new Thread(r).start();
     }
}
