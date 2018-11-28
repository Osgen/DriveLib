package driveLib.Controller;


import driveLib.Models.Staff;
import driveLib.Repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/staffs")
public class StaffController {

    @Autowired
    StaffRepository staffRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Staff addNewStaff(@RequestBody Staff staff){
        staffRepository.save(staff);
        return staff;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Staff> getStaffById(@PathVariable("id") int id){
        return staffRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Iterable<Staff> getAllStaffs(){
        return staffRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public  @ResponseBody String deleteStaffById(@PathVariable("id") int id){
        staffRepository.deleteById(id);
        return "Staff con id: " +id+" eliminado";
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Staff updateStudent(@RequestBody Staff student){
        staffRepository.save(student);
        return student;
    }
}
