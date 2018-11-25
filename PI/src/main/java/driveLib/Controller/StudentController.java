package driveLib.Controller;

import driveLib.Models.Student;
import driveLib.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String addNewStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
