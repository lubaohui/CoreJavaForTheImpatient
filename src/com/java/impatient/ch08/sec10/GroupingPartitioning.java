package com.java.impatient.ch08.sec10;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @ClassName GroupingPartitioning
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 16:56
 * @Version 1.0
 */
public class GroupingPartitioning {
    public static void main(String[] args) throws IOException {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, List<Locale>> countryToLocales = locales.collect(Collectors
                .groupingBy(Locale::getCountry));
        System.out.println("Swiss locales: " + countryToLocales.get("CH"));

        locales = Stream.of(Locale.getAvailableLocales());
        Map<Boolean, List<Locale>> englishAndOtherLocales = locales.collect(Collectors
                .partitioningBy(l -> l.getLanguage().equals("en")));
        System.out.println("English locales: " + englishAndOtherLocales.get(true));
        System.out.println("No English locales: " + englishAndOtherLocales.get(false));
    }
}