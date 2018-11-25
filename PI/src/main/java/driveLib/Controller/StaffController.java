package driveLib.Controller;


import driveLib.Models.Staff;
import driveLib.Repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    StaffRepository staffRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String addNewStaff(@RequestBody Staff staff){
        staffRepository.save(staff);
        return "Saved";
    }

    @RequestMapping("/all")
    public @ResponseBody Iterable<Staff> getAllStaffs(){
        return staffRepository.findAll();
    }
}
