package com.vicente.rest.backend.steam;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMethodsExample {
    public static void main(String[] args) {
        List<String>  names = List.of("Vicente", "Juan", "Catalina","Vicente");
        List<String> longNames =
                names.stream()
                .filter(name -> name.length() > 3 )
                .toList();

        System.out.println(longNames);


        List<Integer> lengthNames = names.stream()
                .map(String::length)
                .collect(Collectors.toList());


        List<List<Integer>> list = List.of(List.of(1,2,3),List.of(4,5,6));
        List<Integer> flatNames = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        List<Integer> numbers = List.of(3,1,3,5,2);
        List<Integer> uniqueOrder = numbers.stream()
                .distinct()
                .map(n -> n * n)
                .sorted()
                .toList();

        System.out.println(uniqueOrder);


        Set<String> setNames = names.stream()
                .filter(name -> name.length() > 3 )
                .collect(Collectors.toSet());
        System.out.println(setNames);

        long count = numbers.stream().reduce(0,(result,number) -> result + number);

        System.out.println(count);
    }
}
