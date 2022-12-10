package App.dbConnection;

public class Student {
    String firstName;
    int id;

    public Student(String firstName, int id) {
        this.firstName = firstName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
