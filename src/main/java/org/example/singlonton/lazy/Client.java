package org.example.singlonton.lazy;

public class Client {
    public static void main(String[] args) {
        DBConnection.getInstance();
    }
}
