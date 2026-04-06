package com.vicente.rest.backend.supplier;

import java.util.function.Supplier;

public class SuplierExample {
    public static void main(String[] args) {
        Supplier<Person> personFactory = () -> new Person("Vicente");
        Person p1 = personFactory.get();
        System.out.println(p1.getName());
    }
}
