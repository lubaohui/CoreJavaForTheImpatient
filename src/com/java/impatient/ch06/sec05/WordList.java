package com.java.impatient.ch06.sec05;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @ClassName WordList
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:22
 * @Version 1.0
 */
public class WordList extends ArrayList<String> {
    @Override
    public boolean add(String e) {
        return isBadWord(e) ? false : super.add(e);
    }

    @Override
    public String get(int i) {
        return super.get(i).toLowerCase();
    }
                
    public static boolean isBadWord(String s) {
        return Arrays.asList("sex", "drugs", "c++").contains(s.toLowerCase());
    }
}