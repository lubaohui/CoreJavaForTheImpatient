package com.java.impatient.ch05.sec01;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @ClassName TryWithResourcesDemo
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-11 20:47
 * @Version 1.0
 */
public class TryWithResourcesDemo {

    public static void main(String[] args) throws IOException {
        List<String> lines = Arrays.asList("Mary had a little lamb. Its fleece was white as snow.".split(" "));

        try (PrintWriter out = new PrintWriter("output.txt")) {
            for (String line : lines) {
                out.println(line.toLowerCase());
            }
        }
        
        try (Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
                PrintWriter out = new PrintWriter("output.txt")) {
            while (in.hasNext()){
                out.println(in.next().toLowerCase());
            }
        }
    }
}
