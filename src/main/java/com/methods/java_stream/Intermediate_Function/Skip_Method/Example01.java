package com.methods.java_stream.Intermediate_Function.Skip_Method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example01 {
    public static void main(String[] args) {

        //Q:- Skip the first 3 elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,7,9,22);

     List<Integer> elements =   numbers.stream()
                                       .skip(4)
                                       .collect(Collectors.toList());
     System.out.println(elements);

    }
}
