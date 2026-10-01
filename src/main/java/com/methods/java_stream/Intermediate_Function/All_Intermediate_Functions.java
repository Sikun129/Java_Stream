package com.methods.java_stream.Intermediate_Function;

import java.util.ArrayList;
import java.util.List;

public class All_Intermediate_Functions {
    public static void main(String[] args) {
//       List<Integer> list =new ArrayList<>(List.of(1,41,11,13,34));

        //Intermediate Functions
                            // (fillter/map)function
//        list.stream()
//                .filter(x -> x > 10)
//                .filter(x-> x % 2==0)
//                .map(x-> x*2)
//                .forEach(System.out::println);

                         // (flatmap)function
//        List<List<Integer>> list1 = List.of (List.of(1,2),List.of(3,4));
//        list1.stream()
//                .flatMap(x -> x.stream())
//                .map(x -> x * 3)
//                .forEach(System.out::println);

                              // (sorted)function
//        List<Integer> list2 =new ArrayList<>(List.of(1,41,3,39,11,10,13,34));
//        list2.stream()
//                .filter(x->x >10)
//                .map(x-> x*2)
//                .sorted()
//                .forEach(System.out::println);

                                     // (distinct)function
//        List<Integer> list3 =new ArrayList<>(List.of(11,34,1,13,4,13,34));
//        list3.stream()
//                .filter(x->x >10)
//                .map(x->x * 2)
//                .sorted()
//                .distinct()
//                .forEach(System.out::println);

                         // (limit/skip)function
//        List<Integer> list4 =new ArrayList<>(List.of(1,7,11,19,38,44));
//        Stream.iterate(1, x-> x+1)
//                .limit(101)
//                .skip(46)
//                .forEach(System.out::println);

        List<Integer> list5 =new ArrayList<>(List.of(1,17,15,59,78,14));
        list5.stream()
                .filter(x -> x>10)
                .map(x-> x*2)
                .peek(System.out::println)
                .sorted()
                .distinct()
                .forEach(System.out::println);




    }
}
