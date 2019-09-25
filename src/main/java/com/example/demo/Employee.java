package com.example.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {

    String firstName;
    String lastName;
    double salary;
    int deptNo;

    public Employee(String firstName, String lastName, double salary, int deptNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.deptNo = deptNo;
    }
}
