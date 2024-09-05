package org.example.proxy;

public class RealImage implements Image{

    String name ;
    public RealImage(String name)
    {
        this.name= name;
        loadImage();
    }
    public void loadImage()
    {
        System.out.println("loading file ="+ name);
    }

    @Override
    public void display() {
        System.out.println("Displaying image "+ name);
    }
}
