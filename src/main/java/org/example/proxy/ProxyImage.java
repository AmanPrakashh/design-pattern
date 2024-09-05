package org.example.proxy;

public class ProxyImage implements Image{
    String name ;
    RealImage realImage;

    public ProxyImage(String name)
    {
        this.name = name;
    }


    @Override
    public void display() {
        if(realImage==null)
        {
            realImage= new RealImage(name);
            realImage.display();
        }
        else {
            realImage.display();
        }
    }
}
