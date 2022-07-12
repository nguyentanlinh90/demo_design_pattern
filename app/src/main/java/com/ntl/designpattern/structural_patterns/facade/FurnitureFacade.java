package com.ntl.designpattern.structural_patterns.facade;

public class FurnitureFacade {

    private static FurnitureFacade instance;

    private Furniture chair;
    private Furniture television;
    private Furniture table;


    public FurnitureFacade() {
        chair = new Chair();
        television = new Television();
        table = new Table();
    }

    public static FurnitureFacade getInstance() {
        if (instance == null) {
            instance = new FurnitureFacade();
        }
        return instance;
    }

    public void makeTableAndChair() {
        table.make();
        chair.make();
    }

    public void makeTelevisionAndChair() {
        television.make();
        chair.make();
    }
}
