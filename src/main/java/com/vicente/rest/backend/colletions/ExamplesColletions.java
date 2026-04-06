package com.vicente.rest.backend.colletions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ExamplesColletions {
    public static void main(String[] args) {
        List<String> names = List.of("Vicente", "Juan", "Pedro");
        names.forEach(System.out::println);

        System.out.println("------------");

        Consumer<String> name = (n) -> System.out.println(n);
        names.forEach(name);

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        //Function<Integer, Integer> number = (n) -> n * n;

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers);

        List<String> words = new ArrayList<>(List.of("Hola", "Mundo", "Adios", "Java", "Lambdas"));
        words.replaceAll(word -> word.toUpperCase());
        System.out.println(words);


    }
}
