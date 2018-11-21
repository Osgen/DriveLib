package driveLib.Dao;

import driveLib.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static{
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Virgen", "oscar",
                        "@ucol", 123, "pass"));
                put(2, new Student(2, "Virgen", "Juan",
                        "@ucolchido", 1234, "pass1"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public  Student getStudentById(int id){
        return this.students.get(id);
    }

    public void removeStudentById(int id){
        this.students.remove(id);
    }

    public void updateStudent(Student student){
        Student s = students.get(student.getIdStudent());
        s.setLastNameStudent(student.getLastNameStudent());
        s.setNameStudent(student.getNameStudent());
        s.setEmailStudent(student.getEmailStudent());
        s.setTelephoneStudent(student.getTelephoneStudent());
        s.setPassword(student.getPassword());
        //students.put(student.getIdStudent(), student);
    }

    public void inserStudent(Student student) {
        this.students.put(student.getIdStudent(), student);
    }
}
