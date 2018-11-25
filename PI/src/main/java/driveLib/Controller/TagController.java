package driveLib.Controller;


import driveLib.Models.Tag;
import driveLib.Repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tag")
public class TagController {

    @Autowired
    TagRepository tagRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String addNewTag(@RequestBody Tag tag){
        tagRepository.save(tag);
        return "saved";
    }

    @RequestMapping("/all")
    public @ResponseBody Iterable<Tag> getAllTags(){
        return tagRepository.findAll();
    }
}
