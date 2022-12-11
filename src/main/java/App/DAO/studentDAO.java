package App.DAO;

import java.sql.SQLException;
import java.util.List;

public interface studentDAO {
    public List<Student> findAll();
    Student findById(int id);
    void  save(Student student) throws SQLException;


}
