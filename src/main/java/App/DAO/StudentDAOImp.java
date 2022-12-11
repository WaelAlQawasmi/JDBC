package App.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDAOImp implements studentDAO{
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public void save(Student student) throws SQLException {

        Connection con=  DBConnection.getConnection();
        if (con==null){
           return;
        }

        if (student.getId()>0){ //update
            String query="UPDATE student set last_name=?,first_name=? where id=?";
            try {
                PreparedStatement preparedStatement=con.prepareStatement(query);

                preparedStatement.setString(1,student.lastName);
                preparedStatement.setString(2,student.firstName);
                preparedStatement.setInt(3,student.getId());
                preparedStatement.executeUpdate();
                preparedStatement.close();



            }
            catch (Exception exception){
                exception.getMessage();
            }
            finally {
                con.close();
            }
        }
        else {
            String query="INSERT INTO student (last_name,first_name) VALUES (?,?)";
            try {
                PreparedStatement preparedStatement=con.prepareStatement(query);

                preparedStatement.setString(1,student.firstName);
                preparedStatement.setString(2,student.lastName);
                preparedStatement.executeUpdate();
                preparedStatement.close();



            }
            catch (Exception exception){
                exception.getMessage();
            }
            finally {
                con.close();
            }
        }



    }
}
