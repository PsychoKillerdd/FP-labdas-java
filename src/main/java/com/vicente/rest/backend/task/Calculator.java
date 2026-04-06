package com.vicente.rest.backend.task;

public class Calculator {
    public void operateAndPrint(int a,int b,Operation op){
        int result = op.operate(a,b);
        System.out.println(result);

    }
    public static void main(String[] args) {
     Calculator calc = new Calculator();
     calc.operateAndPrint(5,5, (a,b) -> a + b);
     calc.operateAndPrint(5,5, (a,b) -> a / b);
     calc.operateAndPrint(5,5, (a,b) -> a * b);
    }
}

@FunctionalInterface
interface Operation {
    int operate(int a, int b);

}
