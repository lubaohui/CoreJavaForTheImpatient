package com.java.impatient.ch06.sec05;

import java.util.ArrayList;

/**
 * 
 * @ClassName WordListDemo
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:52
 * @Version 1.0
 */
public class WordListDemo {
    public static void main(String[] args) {
        WordList words = new WordList();
        ArrayList<String> strings = words; // Ok—conversion to superclass
        strings.add("Hello");
        strings.add("C++");
        System.out.println(words);
    }
}
