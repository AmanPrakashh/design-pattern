package org.example.proxy;

public class Client {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("Image.pdf");
        proxyImage.display();

    }
}
