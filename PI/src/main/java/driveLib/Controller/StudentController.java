package driveLib.Controller;

import driveLib.Models.Student;
import driveLib.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Student addNewStudent(@RequestBody Student student){
        studentRepository.save(student);
        return student;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Optional<Student> getStudentById(@PathVariable("id") int id){
        return studentRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public  @ResponseBody String deleteStudentById(@PathVariable("id") int id){
        studentRepository.deleteById(id);
        return "Alumno eliminado";
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Student updateStudent(@RequestBody Student student){
        studentRepository.save(student);
        return student;
    }
}
