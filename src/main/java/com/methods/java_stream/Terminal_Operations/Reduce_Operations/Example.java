package com.methods.java_stream.Terminal_Operations.Reduce_Operations;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        //Q:- Find the sum of all numbers in a list

        List<Integer> numbers = Arrays.asList( 2, 8, 4,22 ,15);

      int sum = numbers.stream()
                .reduce(0, Integer :: sum);

        System.out.println(numbers);
        System.out.println(sum);
    }
}
