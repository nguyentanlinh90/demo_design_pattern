package com.ntl.designpattern.creational_patterns.builder;

public interface Builder {
    Builder buildRoof(boolean hasRoof);

    Builder buildPool(boolean hasPool);

    Builder buildWalls(int walls);

    Builder buildDoors(int doors);

    Builder buildColors(String color);

    House build();
}
