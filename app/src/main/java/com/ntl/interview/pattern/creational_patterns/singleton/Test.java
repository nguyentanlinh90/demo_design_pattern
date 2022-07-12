package com.ntl.interview.pattern.creational_patterns.singleton;

public class Test {

    public static void main(String[] args) {
        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        eagerInitialization.setName("linh nguyen");
        System.out.println(eagerInitialization.getName());

        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        System.out.println(eagerInitialization2.getName());
    }
}
