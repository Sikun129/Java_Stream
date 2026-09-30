package com.methods.java_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Terminal_Stream {
    public static void main(String[] args) {

        List<Integer> list1 =new ArrayList<>(List.of(1,13,11,9));
                       // (forEach()/forEachOrdered())
//        list1.stream()
//                .map(x-> x+5)
//                .forEach(System.out::println);
//                            or
//                .forEachOrdered(System.out::println);

//        List<Integer> list2 =new ArrayList<>(List.of(1,33,6,17,21,29));
//                         // (toList())
//          List<Integer> list3=list2.stream()
//                  .map(x -> x+1)
//                  .toList();
//          System.out.println(list3);

//        List<Integer> list4 =new ArrayList<>(List.of(1,13,21,19));
//                                   //(collect())
//      List<Integer> lis =  list4.stream()
//                .map(x -> x +1)
//                .collect(Collectors.toList());
//
//      lis.add(20);
//        System.out.println(list1);

//        List<Integer> list5 =new ArrayList<>(List.of(1,13,19,23,9));
//                            //(Ruduce())
//      int sum = list5.stream()
//                .reduce(1, (a,b) -> a+b);
//      System.out.println(sum);

//        List<Integer> list6 =new ArrayList<>(List.of(1,3,18,9));
//                            //(Count())
//      long sum =  list6.stream()
//                .filter(x-> x >10)
//                .count();
//      System.out.println(sum);

//        List<Integer> list7 =new ArrayList<>(List.of(1,16,12,11,9));
//                            //(anyMatch())
//      boolean num =  list7.stream()
//                .filter(x -> x > 10)
//                .anyMatch(x -> x % 2 == 0);
//      System.out.println(num);

        List<Integer> list8 =new ArrayList<>(List.of(1,33,11,14,19));
                                //(allMatch())
      boolean num1 = list8.stream()
                .filter(x -> x>10)
                .allMatch(x -> x % 2 == 0);
        System.out.println(num1);






    }
}
