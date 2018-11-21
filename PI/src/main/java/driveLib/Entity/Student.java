package driveLib.Entity;

public class Student {

    private int idStudent;
    private String  nameStudent;
    private String emailStudent;
    private long telephoneStudent;
    private String password;

    public Student(int idStudent, String lastNameStudent, String nameStudent,
                   String emailStudent, long telephoneStudent, String password) {
        this.idStudent = idStudent;
        this.lastNameStudent = lastNameStudent;
        this.nameStudent = nameStudent;
        this.emailStudent = emailStudent;
        this.telephoneStudent = telephoneStudent;
        this.password = password;
    }

    public Student(){}

    public int getIdStudent() {
        return idStudent;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public long getTelephoneStudent() {
        return telephoneStudent;
    }

    public String getPassword() {
        return password;
    }

    private String lastNameStudent;

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public void setTelephoneStudent(long telephoneStudent) {
        this.telephoneStudent = telephoneStudent;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
