package com.java.impatient.ch08.sec02;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @ClassName CreatingStreams
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 14:44
 * @Version 1.0
 */
public class CreatingStreams {

    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
        System.out.print(title + ": " + firstElements.size() + " +++ ");
        if (firstElements.size() <= SIZE)
            System.out.println(firstElements);
        else {
            firstElements.remove(SIZE);
            String out = firstElements.toString();
            System.out.println(out.substring(0, out.length() - 1) + ", ...]");
        }
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("alice.txt");
        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        //静态of方法把数组转化为流
        Stream<String> words = Stream.of(contents.split("\\PL+"));
        show("words", words);
        //静态of方法把多个元素转发为流
        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        show("song", song);

        //创建空流
        Stream<String> silence = Stream.empty();
        show("silence", silence);

        //generate接受一个无参数的函数产生一个值
        Stream<String> echos = Stream.generate(() -> "Echo");
        show("echos", echos);

        Stream<Double> randoms = Stream.generate(Math::random);
        show("randoms", randoms);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));
        show("integers", integers);


        Stream<String> wordsAnotherWay = Pattern.compile("\\PL+").splitAsStream(contents);
        show("wordsAnotherWay", wordsAnotherWay);

        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            show("lines", lines);
        }
    }
}
