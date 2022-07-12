package com.ntl.interview.pattern.structural_patterns.proxy;

public class RealImage implements ImageSubject {

    public String url;

    public RealImage(String url) {
        this.url = url;
    }

    @Override
    public void load() {
        System.out.println("Load from " + this.url);
    }
}
