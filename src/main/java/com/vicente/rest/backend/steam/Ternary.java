package com.vicente.rest.backend.steam;

public class Ternary {
    public static void main(String[] args) {
        int age = 20;
        String message;

        message = age > 18 ? "Mayor de edad" : "Menor de edad";
        System.out.println(message);


        int score = 75;
        String level;
        level = score >= 80 ? "A" : score >= 60 ? "B" : "C";


        int accesLevel = 0;
        String accesMessage = "Acceso Denegado";


        accesMessage = accesLevel >= 1 ? (accesLevel >= 3 ? "Acceso Total" : "Acceso Parcial") : "Acceso Denegado";
        System.out.println(accesMessage);

    }
}
