package com.vicente.rest.backend;
public class Main {
    public static void main(String[] args) {


        Operation operation = new Operation() {
        @Override
        public int operate(int a, int b) {
            return a + b;
            }
        };
        System.out.println(operation.operate(1, 2));
        //aunque les gusta mantener una cierta simplicdad en la programacion funcional, se pueden hacer mas complejas con logica if while for todo
        Operation plus = (a,b) -> a + b;


        Operation multiply = (a,b) -> a * b;
        System.out.println(multiply.operate(1, 2));

    }
}
@FunctionalInterface
interface Operation{
    //las interfaces funcionales solo pueden tener un metodo
    int operate(int a, int b);

    default String show(){
        return "Soy una operacion";
    }
    static Operation subtracion(){
        return (a,b) -> a - b;
    }
}