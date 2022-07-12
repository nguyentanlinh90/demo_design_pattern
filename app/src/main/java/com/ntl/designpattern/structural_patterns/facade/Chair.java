package com.ntl.designpattern.structural_patterns.facade;

public class Chair implements Furniture {
    @Override
    public void make() {
        System.out.println("Make Chair");
    }
}
