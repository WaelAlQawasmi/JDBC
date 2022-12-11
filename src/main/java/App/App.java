package App;

import App.DAO.DBConnection;
import App.DAO.Student;
import App.DAO.StudentDAOImp;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
//        Connection DBConn =  DBConnection.getConnection();
//        if (DBConn==null){
//            System.out.println("failed to connect");
//        }
//        else {
//            System.out.println("Successfully connect");
//        }

        StudentDAOImp studentDAOImp=new StudentDAOImp();

        Student student=new Student("wael","al qawasmi",0);
        studentDAOImp.save(student);

        Student student2=new Student("wael","al qawasmi2010",1);
        studentDAOImp.save(student2);






    }
}
