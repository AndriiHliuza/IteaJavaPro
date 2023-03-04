package com.itea.andrii.lecture17.lesson17;

import java.util.*;
import java.util.stream.*;

public class DemoStream {
    public static void main(String[] args) {
        Arrays.stream(args)
                .filter(s -> s.length() <= 2)
                .map(s -> s + " TEST")
                .forEach(System.out::println);

        IntStream.of(120, 410, 84, 32, 314, 12)
                .filter(x -> x < 300)
                .map(x -> x + 11)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("----------------");


        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        IntStream.range(0, 1000000)
                .parallel()
                .forEach(i -> list.add(i));
        System.out.println(list.size());

        IntStream.range(0, 10)
                .skip(5)
                .limit(3)
                .skip(1)
                .forEach(System.out::println);

        OptionalInt max = IntStream.range(10, 1000000)
                .parallel()
                .findFirst();
        System.out.println(max.getAsInt());

        LongSummaryStatistics summaryStatistics = LongStream.range(2, 16)
                .summaryStatistics();

        System.out.println(summaryStatistics);

        System.out.println("----------------------");

        Map<Boolean, List<Integer>> map;

        map = Stream.of(1, 2, 3, 1, 9, 1, 5, 3, 4, 8, 2)
                .collect(CustomCollector.partitioningByUniqueness());

        System.out.println(map);

    }
}
