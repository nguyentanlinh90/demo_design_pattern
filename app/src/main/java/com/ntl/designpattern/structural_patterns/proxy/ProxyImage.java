package com.ntl.designpattern.structural_patterns.proxy;

public class ProxyImage implements ImageSubject {

    private String url;
    private RealImage realImage;

    public ProxyImage(String url) {
        this.url = url;
        System.out.println("Init");
    }

    @Override
    public void load() {
        //lazy - khi nao su dung thi moi khoi tao, ko khoi tao truoc
        if (realImage == null) {
            realImage = new RealImage(url);
        } else {
            System.out.println("Image already existed");
        }

        realImage.load();
    }
}
