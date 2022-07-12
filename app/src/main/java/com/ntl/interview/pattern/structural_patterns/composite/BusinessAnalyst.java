package com.ntl.interview.pattern.structural_patterns.composite;

public class BusinessAnalyst extends Employee{


    public BusinessAnalyst(int age, String name, double salary) {
        super(age, name, salary);
    }

    @Override
    public void add(Employee employee) {
    }

    @Override
    public void remove(Employee employee) {
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }
}
