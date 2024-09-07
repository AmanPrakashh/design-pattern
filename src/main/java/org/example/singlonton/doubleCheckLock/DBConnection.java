package org.example.singlonton.doubleCheckLock;

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection() {

    }

    // thread safe lazy Initialization as this method will get locked and second
    // second thread will enter the block
    // very slow as everytime the method can be called by only one thread
    synchronized public static DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
            return dbConnection;
    }
}
