package com.ntl.interview.pattern.creational_patterns.singleton;

public class LazyInitialization {
    private static LazyInitialization instance;

    public LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }


}
