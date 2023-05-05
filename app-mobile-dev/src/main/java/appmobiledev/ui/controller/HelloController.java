package appmobiledev.ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {

    @RequestMapping( "/hello" )
    public String echo() {
        return "Hello World! - helo contro";
    }

}
