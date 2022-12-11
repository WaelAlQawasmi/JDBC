package App.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private  static  final String Host="localhost";
    private  static  final int port=3306;
    private  static  final String DBName="jdbc";
    private  static  final String DBuserName="root";
    private  static  final String DBPassword="";
    private  static Connection connection;

    public static Connection getConnection() {
        //jdbc:mysql://localhost:3306/jdbc
        try {
            connection= DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s",Host,port,DBName),DBuserName,DBPassword);

        }
        catch (Exception ex){
            ex.getMessage();
        }
        return  connection;
    }

}
