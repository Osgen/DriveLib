package driveLib.Controller;


import driveLib.Models.Author;
import driveLib.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String addNewAuthor(@RequestBody Author author){
        authorRepository.save(author);
        return "Saved";
    }

    @RequestMapping("/all")
    public @ResponseBody Iterable<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

}
