package com.methods.java_stream.Terminal_Operations.Count_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example {
    public static void main(String[] args) {

        //Q:- Count the number of Strings with length greater than 3

        List<String> words = Arrays.asList("Hello", "World","java","python", "Aws");

     Long count = words.stream()
                .filter(x -> x.length() > 3)
                .count();
        System.out.println(words);
        System.out.println(count);




    }
}
