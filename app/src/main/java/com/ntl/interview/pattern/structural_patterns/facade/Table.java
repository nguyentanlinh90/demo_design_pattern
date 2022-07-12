package com.ntl.interview.pattern.structural_patterns.facade;

public class Table implements Furniture {
    @Override
    public void make() {
        System.out.println("Make Table");
    }
}
