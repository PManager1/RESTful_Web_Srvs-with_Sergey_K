package appmobiledev.ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping( "/hello" )
    public String echo() {
        return "Hello World! - from Hello contro";
    }

}
