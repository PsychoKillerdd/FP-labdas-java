package com.vicente.rest.backend.predicated;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicatedExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        boolean result = isEven.test(10);
         System.out.println("Es par ? " + result);
        BiPredicate<String,Integer>  checkLength = (str,len) -> str.length() == len;
        result = checkLength.test("Hola",5);
         System.out.println("La longitud es correcta ? " + result);
    }
}
