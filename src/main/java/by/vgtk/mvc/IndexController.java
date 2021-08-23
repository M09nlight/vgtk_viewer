package by.vgtk.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {


    @GetMapping("/indexTemp")
    public String indexTemp(Model model) {

        return "indexTemp";
    }

    @RequestMapping(value = { "/index" }, method = {RequestMethod.POST, RequestMethod.GET})
    public String messages(Model model) {
        
        System.out.println("index open");
        
		return "index";
	}
    
    
    @GetMapping("/photoSpps")
    public String photo(Model model) {
        return "photoSpps";
    }
}
