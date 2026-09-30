package com.methods.java_stream.Intermediate_Function.FlatMap_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap_Example01 {
    public static void main(String[] args) {

        //Q:- Flatten the list of Fruits

        List<List<String>> fruits = Arrays.asList(
                Arrays.asList("Apple", "Banana", "Chery"),
                Arrays.asList("Graps", "Pineapple", "Mango"),
                Arrays.asList("Plum", "Peach", "Strawberry")
        );

        List<String> allfruits = fruits.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(allfruits);
    }
}
