package com.methods.java_stream.Terminal_Operations.FindFirst_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example {

    public static void main(String[] args) {

        //Q:- Find the  first number greater than 10 in a list

        List<Integer> numbers = Arrays.asList(5,8,2,9,43);

        Optional<Integer> first = numbers.stream()
                .filter(num -> num > 10)
                .findFirst();

        first.ifPresent(num -> System.out.println("First > 10 : " + num));


    }
}
