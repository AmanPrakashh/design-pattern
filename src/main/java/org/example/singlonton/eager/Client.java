package org.example.singlonton.eager;

public class Client {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getDbConnection();

    }
}
