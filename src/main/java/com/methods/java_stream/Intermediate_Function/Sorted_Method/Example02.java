package com.methods.java_stream.Intermediate_Function.Sorted_Method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example02 {
    public static void main(String[] args) {

        //Q:- Sort names in reverse order

        List<String> names = Arrays.asList("Rahul","Bob","Om","Banty","Tonny");
       List<String> reverse = names.stream()
                                   .sorted((a,b) -> a.compareTo(b))
                                   .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(reverse);
    }
}
