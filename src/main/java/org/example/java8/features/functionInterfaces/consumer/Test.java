package org.example.java8.features.functionInterfaces.consumer;

import java.util.function.Consumer;

public class Test {
    public static void main(String... args){
        Consumer<String> consumer = (value)->System.out.println(value);
        consumer.accept("Mahendra Reddy Mareddy");
    }
}
