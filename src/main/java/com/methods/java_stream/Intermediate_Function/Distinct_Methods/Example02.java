package com.methods.java_stream.Intermediate_Function.Distinct_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
@Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person)obj;
        return age == person.age && name.equals(person.name);
}
@Override
public int hashCode() {
        return name.hashCode() + age;
}

@Override
    public String toString() {
        return name + " ( " + age +")";
}
}
public class Example02 {
    public static void main(String[] args) {

        //Q:- Remove duplicate person from list

        List<Person> people =Arrays.asList(
                new  Person("Rahul",35),
                new  Person("Charlie",26),
                new Person("Sonu", 34),
                new Person("Bob", 29)
        );

      List<Person> uniquepeople = people.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(people);
        System.out.println(uniquepeople);


    }
}
