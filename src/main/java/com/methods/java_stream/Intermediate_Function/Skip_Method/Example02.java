package com.methods.java_stream.Intermediate_Function.Skip_Method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example02 {
    public static void main(String[] args) {

        //Q:- Filter even numbers and skip the first 2

        List<Integer> numbers = Arrays.asList(5,10,20,44,30,25,40);

    List<Integer> evenNumber =   numbers.stream()
                .filter(x -> x % 2 == 0)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
