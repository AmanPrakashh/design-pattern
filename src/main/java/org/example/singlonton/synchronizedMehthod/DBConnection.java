package org.example.singlonton.synchronizedMehthod;

public class DBConnection {

    //resolves memory issue.
    //L1 cache issue in multicore system.
    //every read and write will happen from memory not from cache due to volatile keyword
    //also resolves reordering issue
    private static volatile DBConnection dbConnection;

    private DBConnection() {

    }

    // thread safe lazy Initialization as this method will get locked and second
    // second thread will enter the block
    // very slow as everytime the method can be called by only one thread
    public static DBConnection getInstance() {
        if (dbConnection == null) { //  check 1
            synchronized (DBConnection.class) {
                if (dbConnection == null)  // check 2
                {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
}
