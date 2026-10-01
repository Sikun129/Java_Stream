package com.methods.java_stream.Terminal_Operations.AllMatch_Operations;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        //Q:- Check if all numbers in a list are even

        List<Integer> numbers = Arrays.asList(2,4,8,7,5,9);

     boolean AllEven = numbers.stream()
                .allMatch(x -> x % 2 == 0);

        System.out.println(numbers);
        System.out.println(AllEven);
    }
}
