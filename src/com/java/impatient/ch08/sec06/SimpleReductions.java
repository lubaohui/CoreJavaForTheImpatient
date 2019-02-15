package com.java.impatient.ch08.sec06;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

/**
 * 
 * @ClassName SimpleReductions
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 16:38
 * @Version 1.0
 */
public class SimpleReductions {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("alice.txt")),
                StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        Optional<String> largest = words.stream().max(String::compareToIgnoreCase);
        System.out.println("largest: " + largest.orElse(""));

        boolean aWordStartsWithQ = words.stream().anyMatch(s -> s.startsWith("Q"));
        System.out.println("aWordStartsWithQ: " + aWordStartsWithQ);

        Optional<String> startsWithQ = words.stream().parallel().filter(s -> s.startsWith("Q")).findAny();
        System.out.println("startsWithQ: " + startsWithQ.orElse("(None)"));
            // Run the program again to see if it finds a different word
    }
}
