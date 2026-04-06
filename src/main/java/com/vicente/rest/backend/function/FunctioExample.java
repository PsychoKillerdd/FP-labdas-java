package com.vicente.rest.backend.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctioExample {
    public static void main(String[] args) {
        Function<String,Integer> stringLenghth = String::length;
        int lengthOfWord = stringLenghth.apply("Hola");
        System.out.println("La longitud de la cadena es: " + lengthOfWord);

        BiFunction<Integer,Integer,String> sumToString = (a,b) -> "Resultado: " + (a + b);
        String result = sumToString.apply(7,5);
        System.out.println(result);

    }
}
