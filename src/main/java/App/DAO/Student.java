package App.DAO;

public class Student {
    String firstName;
    String lastName;
    int id;

    public Student(String firstName, String lastName ,int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id=id;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
