package org.example.singlonton.doubleCheckLock;

public class Client {
    public static void main(String[] args) {
        DBConnection.getInstance();
    }
}
