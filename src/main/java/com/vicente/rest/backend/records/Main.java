package com.vicente.rest.backend.records;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<ProductDto> products = List.of(new ProductDto("Laptop", 1000.00), new ProductDto("Smartphone", 500.00));


        List<String> products2 = products.stream()
                .map(productDto -> new ProductDto(productDto.name(), productDto.price() * 0.9))
                .map(productDto -> String.format("%s: $%.2f",productDto.name(),productDto.price()))
                .toList();

        System.out.println(products2);

        Map<String,List<ProductDto>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy
                        (ProductDto -> ProductDto.price() > 50.0 ? "Caro" : "Barato"));

        System.out.println();

        Map<String,Long> countByrange = products.stream()
                .collect(Collectors.groupingBy
                        (ProductDto -> ProductDto.price() > 900.0 ? "Caro" : "Barato",
                                Collectors.counting()));

        System.out.println(countByrange);

        Double total = products.stream()
                .map(productDto -> productDto.price())//transforma los elementos por cada iteracion extrayendo el price O(n)
                .reduce(0.0,(sum,price) -> sum + price); // suma los elementos en cada iteracion O(n(O(1)))

        System.out.println(total);

        String productsSumary = products.stream()
                .map(p -> p.name() + "($" + p.price() + ")")
                .reduce("",(st1,st2) -> {
                    if(st1.isEmpty()){
                        return st2;
                    }else {
                        return st1 + " | " + st2;
                    }
                });
        System.out.println(productsSumary);




        Map<String,Double> productMap = products.stream()
                .collect(Collectors
                        .toMap(
                                ProductDto::name,
                                ProductDto::price,
                                (oldV,newVal) -> newVal
                        ));


        List<ProductDto> expensiveProducts = productMap.entrySet().stream()
                .filter(e -> e.getValue() > 100)
                .map(e -> new ProductDto(e.getKey(),e.getValue()))
                .toList();











        Set<Double> uniquePrices = products.stream()
                .map(ProductDto::price)
                .collect(Collectors.toSet());

        System.out.println(uniquePrices);
    }
}
