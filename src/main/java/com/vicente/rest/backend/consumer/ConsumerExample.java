package com.vicente.rest.backend.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

        public static void main(String[] args) {
            Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
            printUpper.accept("Hola");

            BiConsumer<String,Integer> repet = (String word,Integer times) -> {
                for (int i = 0; i < times ; i++) {
                    System.out.println(word);
                }
            };

            repet.accept("Hola",3);
        }
}
