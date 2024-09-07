package org.example.singlonton.eager;

//Eager Initialization
public class DBConnection {
    // static so that it belongs to class not to object
    // Object is made private so that no once could access it and change its variable or data
    private static DBConnection dbConnection = new DBConnection();

    //private constructor
    private DBConnection (){

    }


    //static method
    public static DBConnection getDbConnection() {
        return dbConnection;
    }
}
