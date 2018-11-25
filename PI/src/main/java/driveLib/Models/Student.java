package driveLib.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idStudent;
    private String  nameStudent;
    private String lastNameStudent;
    private String emailStudent;
    private long telephoneStudent;
    private String passwordStudent;

    public Student( String nameStudent, String lastNameStudent,
                   String emailStudent, long telephoneStudent, String password) {
        this.idStudent = idStudent;
        this.lastNameStudent = lastNameStudent;
        this.nameStudent = nameStudent;
        this.emailStudent = emailStudent;
        this.telephoneStudent = telephoneStudent;
        this.passwordStudent = password;
    }

    public Student(){}


    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLastNameStudent(){
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent){
        this.lastNameStudent=lastNameStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public long getTelephoneStudent() {
        return telephoneStudent;
    }

    public void setTelephoneStudent(long telephoneStudent) {
        this.telephoneStudent = telephoneStudent;
    }

    public String getPasswordStudent() {
        return passwordStudent;
    }

    public void setPasswordStudent(String passwordStudent) {
        this.passwordStudent = passwordStudent;
    }


}
