package com.ntl.designpattern.creational_patterns.prototype;

public class ClientTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        User user1 = new User("linh", "abc@gmail.com", 32);

        User user2 = user1; // bad

        User user3 = user1.clone();

    }
}
