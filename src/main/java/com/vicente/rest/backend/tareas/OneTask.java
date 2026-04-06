package com.vicente.rest.backend.tareas;

import java.util.Arrays;
import java.util.List;

public class OneTask {
    public static void main(String[] args) {
        List<Integer> nums = List.of(-4, -1, 0, 3, 10);

        List<Integer> orderList = nums.stream().map(n -> n * n).sorted().toList();
     }
}

public void sortInsertion(List<Integer> arr) {
    Integer n = arr.size();
    for (int i = 0; i < n; i++) {
        Integer key = arr.get(i);
        Integer j = i -1;

        while (j >= 0 && arr[j] > key){
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;

    }
}