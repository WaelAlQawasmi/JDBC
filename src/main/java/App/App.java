package App;

import App.dbConnection.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        Connection DBConn =  DBConnection.getConnection();
        if (DBConn==null){
            System.out.println("failed to connect");
        }
        else {
            System.out.println("Successfully connect");
        }


    }
}
