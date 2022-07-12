package com.ntl.designpattern.structural_patterns.facade;

public class ClientTest {

    public static void main(String[] args) {

        //khong can biet he thong con ben trong lam gi
        //nguoi su dung chi can muon lam gi thoi, chi can truyen doi so
        FurnitureFacade facade = FurnitureFacade.getInstance();
        facade.makeTableAndChair();
        facade.makeTelevisionAndChair();

    }
}
