package com.methods.java_stream.Intermediate_Function.Map_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class Map_Example02 {
    public static void main(String[] args) {

        //Q:-Extract the names of employees using map

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 45900.34),
                new Employee("Tonny", 54000.44),
                new Employee("Banty", 24566.54),
                new Employee("Sonu", 23243.33)

        );

       List<String> names = employees.stream()
                .map(e -> e.name)
               .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(employees);
        System.out.println(names);


    }
}
