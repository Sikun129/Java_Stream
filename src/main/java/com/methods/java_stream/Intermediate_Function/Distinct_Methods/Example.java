package com.methods.java_stream.Intermediate_Function.Distinct_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        //Q:- Removing Duplicate Strings

        List<String> fruits = Arrays.asList("Apple","Banana","Orange", "Apple","Cherry","Banana");

       List<String> duplicate = fruits.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(fruits);
        System.out.println(duplicate);
    }

}
