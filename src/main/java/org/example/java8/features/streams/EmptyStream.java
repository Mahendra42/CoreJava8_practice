package org.example.java8.features.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmptyStream {

    public static void main(String... args){
        Stream<Object> empty = Stream.empty();
        List<String> strings = Arrays.asList("a", "b", "C");
        Set<String> set=new HashSet<>(strings);
        Stream.of("1","a","fg").forEach(System.out::println);
        Stream.of("").collect(Collectors.toSet());
    }
}
