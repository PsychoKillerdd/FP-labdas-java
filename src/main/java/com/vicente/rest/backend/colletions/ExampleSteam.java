package com.vicente.rest.backend.colletions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleSteam {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange","Kiwi");
        List<String> filterFruits = fruits.stream().filter(f -> f.length() > 4 ).toList();


        System.out.println(filterFruits);
        System.out.println(fruits);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> integerStream = numbers.stream().map(n -> n * n).toList();
        System.out.println(integerStream);

    }
}
