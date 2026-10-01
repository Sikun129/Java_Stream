package com.methods.java_stream.Terminal_Operations.NoneMatch_Operations;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        //Q:- Check if no String in a list starts with "Z"

        List<String> names = Arrays.asList("Rahul", "Bob", "Jhone","Charlie","Zoo");

      boolean noNameStartWithZ=  names.stream()
                .noneMatch(x -> x.startsWith("Z"));

        System.out.println(names);
        System.out.println(noNameStartWithZ);
    }
}
