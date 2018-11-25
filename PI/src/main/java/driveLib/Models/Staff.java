package driveLib.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idStaff;
    private String nameStaff;
    private String lastNameStaff;
    private String emailStaff;
    private String passwordStaff;
    private boolean isAdmin;

    public Staff(String nameStaff, String lastNameStaff, String emailStaff, String passwordStaff, boolean isAdmin) {
        this.nameStaff = nameStaff;
        this.lastNameStaff = lastNameStaff;
        this.emailStaff = emailStaff;
        this.passwordStaff = passwordStaff;
        this.isAdmin = isAdmin;
    }

    public Staff(){}

    public Integer getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(Integer idStaff) {
        this.idStaff = idStaff;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public String getLastNameStaff() {
        return lastNameStaff;
    }

    public void setLastNameStaff(String lastNameStaff) {
        this.lastNameStaff = lastNameStaff;
    }

    public String getEmailStaff() {
        return emailStaff;
    }

    public void setEmailStaff(String emailStaff) {
        this.emailStaff = emailStaff;
    }

    public String getPasswordStaff() {
        return passwordStaff;
    }

    public void setPasswordStaff(String passwordStaff) {
        this.passwordStaff = passwordStaff;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }


}
