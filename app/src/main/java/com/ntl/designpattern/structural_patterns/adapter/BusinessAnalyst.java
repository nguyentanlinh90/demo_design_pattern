package com.ntl.designpattern.structural_patterns.adapter;

public class BusinessAnalyst implements Customer {

    private Developer developer;

    public BusinessAnalyst(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void sendRequest(String request) {
        String info = translate(request);
        developer.received(info);
    }

    private String translate(String request) {
        return "Create Zoom";
    }
}
