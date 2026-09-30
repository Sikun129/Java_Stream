package com.methods.java_stream.Intermediate_Function.Filter_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    String name;
    int age;
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
public class Filter_Example02 {
    public static void main(String[] args) {

        //Q:-Filter employess older than 30
        List<Employee> employees = Arrays.asList
                (new Employee("Alice", 28),
                        new Employee("Tonny", 35),
                        new Employee("Sikun", 32),
                        new Employee("Rahul", 30));

    List<Employee> employeesOlderThan30 =
            employees.stream()
                    .filter(x -> x.age > 30 )
                    .collect(Collectors.toList());

        System.out.println(employeesOlderThan30);




    }
}
