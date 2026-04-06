package com.vicente.rest.backend.steam;

import java.util.List;
import java.util.stream.Stream;

public class ExampleSteam {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> streamNumbers = numbers.stream();

        Stream<String> streamString = Stream.of("Hola", "Mundo");

        List<String> namess = List.of("Ana","Luis","Marta","Juan");

        namess.stream().filter(name -> name.length() > 4).map(name -> name.toUpperCase()).forEach(System.out::println);

        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        List<Integer> isGreater = numeros.stream().filter(n -> n > 10).toList();
        Long quenatyGreater = numeros.stream().filter(n -> n > 10).count();

        System.out.println(isGreater);
        System.out.println(quenatyGreater);

        Stream<String> steam1 = Stream.of("Hola", "Mundo");
        steam1.forEach(System.out::println);

        List<String> strings = steam1.toList();
        System.out.println(strings);




    }
}
