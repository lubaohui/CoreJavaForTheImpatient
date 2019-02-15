package com.java.impatient.ch06.sec03;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * 
 * @ClassName CloseablesDemo
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:18
 * @Version 1.0
 */
public class CloseablesDemo {
    public static void main(String[] args) throws Exception {
        PrintStream p1 = new PrintStream("/tmp/1");
        PrintStream p2 = new PrintStream("/tmp/2");
        ArrayList<PrintStream> ps = new ArrayList<>();
        ps.add(p1);
        ps.add(p2);
        Closeables.closeAll(ps);        
    }
}