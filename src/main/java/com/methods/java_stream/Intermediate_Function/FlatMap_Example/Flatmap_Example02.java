package com.methods.java_stream.Intermediate_Function.FlatMap_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap_Example02 {
    public static void main(String[] args) {

        //Q:- Find all the fruit names that start with A from List od List

        List<List<String>> fruits = Arrays.asList(
                Arrays.asList("Apple","Banana","Cherry"),
                Arrays.asList("Mango", "Grapes","Tomato"),
                Arrays.asList("Pineapple", "Peach", "Strawberry")
        );
        List<String> fruitsString = fruits.stream()
                .flatMap(List::stream)
                .filter(x -> x.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println(fruitsString);

    }
}
