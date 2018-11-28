package driveLib.Controller;


import driveLib.Models.Author;
import driveLib.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Author addNewAuthor(@RequestBody Author author){
        authorRepository.save(author);
        return author;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Author> getStaffById(@PathVariable("id") int id){
        return authorRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Iterable<Author> getAllStaffs(){
        return authorRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public  @ResponseBody String deleteStaffById(@PathVariable("id") int id){
        authorRepository.deleteById(id);
        return "Staff con id: " +id+" eliminado";
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Author updateStudent(@RequestBody Author student){
        authorRepository.save(student);
        return student;
    }

}
