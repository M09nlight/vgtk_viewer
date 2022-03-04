package by.vgtk.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = {"/index"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String messages() {
        System.out.println("index open");
        return "index";
    }

}
