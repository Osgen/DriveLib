package driveLib.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class TestController {

    @RequestMapping(value="")
    public String test(){
        return "page/index";
    }

}
