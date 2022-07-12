package com.ntl.interview.pattern.creational_patterns.singleton;

public class ThreadSafe {
    //ghi vao bo nho chinh
    private static volatile ThreadSafe instance;

    private ThreadSafe() {
    }

    //trong 1 thoi diem chi co 1 luong duy nhat
    private static synchronized ThreadSafe getInstance() {
        if (instance == null) {
            instance = new ThreadSafe();
        }

        return instance;
    }

}
