package com.ntl.interview.pattern.structural_patterns.proxy;

public class ClientTest {

    public static void main(String[] args) {

        ProxyImage proxyImage = new ProxyImage("https://abc.com/dev.png");

        System.out.println("first load");
        proxyImage.load();

        System.out.println("second load");
        proxyImage.load();

    }
}
