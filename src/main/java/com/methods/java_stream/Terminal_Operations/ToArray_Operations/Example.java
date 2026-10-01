package com.methods.java_stream.Terminal_Operations.ToArray_Operations;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        //Q:- Convert a list of Strings to an array

        List<String> names = Arrays.asList("Rahul", "Banty", "jerry","Charlie","Simi");

      String[] namesArray =  names.stream()
                .toArray(String[]::new);

        System.out.println(names);
        System.out.println(Arrays.toString(namesArray));
    }
}
