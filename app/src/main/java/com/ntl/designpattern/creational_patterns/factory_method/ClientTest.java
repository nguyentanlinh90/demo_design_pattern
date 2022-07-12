package com.ntl.designpattern.creational_patterns.factory_method;

public class ClientTest {

    public static void main(String[] args) {
        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
        Candy mintyCandy = CandyFactory.getCandy(CandyType.MINTY);

        if (hardCandy != null)
            System.out.println(hardCandy.getCandyName());
        if (mintyCandy != null)
            System.out.println(mintyCandy.getCandyName());

    }
}
