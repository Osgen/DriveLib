package driveLib.Controller;


import driveLib.Models.Tag;
import driveLib.Repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/tags")
public class TagController {

    @Autowired
    TagRepository tagRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String addNewTag(@RequestBody Tag tag){
        tagRepository.save(tag);
        return "saved";
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Iterable<Tag> getAllTags(){
        return tagRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Tag> getTagById(@PathVariable("id") int id){
        return tagRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody String deleteTagById(@PathVariable("id") int id){
        tagRepository.deleteById(id);
        return "Tag con id: "+id+" eliminada";
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Tag updateTagById(@RequestBody Tag tag){
        tagRepository.save(tag);
        return tag;
    }
}
