package org.example.java8.features.optionl;

import java.util.Optional;

public class OptionalClass
{
    public static void main(String... args){
        Optional<Object> empty = Optional.empty();
        Optional<String> aNull = Optional.ofNullable(null);
        System.out.println(Optional.of("null"));
        System.out.println(Optional.empty().isPresent());
        System.out.println(Optional.empty().isEmpty());
        Optional.of("MahendraReddyMareddy").ifPresent(value -> System.out.println(value.length()));
        System.out.println(Optional.ofNullable("Mahendra Reddy M").orElse("Mareddy"));
        System.out.println(Optional.ofNullable(null).orElse("Mareddy"));

        System.out.println(Optional.ofNullable(null).orElseGet(()-> "mahendra"));
        //System.out.println(Optional.ofNullable(null).orElseThrow(() -> new RuntimeException()));

    }
}
