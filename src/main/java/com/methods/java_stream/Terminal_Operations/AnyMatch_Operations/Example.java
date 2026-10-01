package com.methods.java_stream.Terminal_Operations.AnyMatch_Operations;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        //Q:-Check if any number in a list is greater than 50

        List<Integer> numbers = Arrays.asList(10,20,60,40,80);

     boolean greaterThan50 = numbers.stream()
                .anyMatch(x-> x >50);

        System.out.println(numbers);
        System.out.println(greaterThan50);
    }
}
