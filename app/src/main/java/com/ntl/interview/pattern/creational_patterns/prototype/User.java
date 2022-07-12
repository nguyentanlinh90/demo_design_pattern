package com.ntl.interview.pattern.creational_patterns.prototype;

import androidx.annotation.NonNull;

public class User implements Cloneable {
    public String userName;
    public String email;
    public int age;

    public User(String userName, String email, int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;
    }

    @NonNull
    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
