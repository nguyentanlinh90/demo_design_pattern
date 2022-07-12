package com.ntl.interview.pattern.creational_patterns.singleton;

public class DoubleCheckLocking {

    private static volatile DoubleCheckLocking instance;

    public DoubleCheckLocking() {
    }

    private static synchronized DoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckLocking();
                }
            }
        }

        return instance;
    }
}
