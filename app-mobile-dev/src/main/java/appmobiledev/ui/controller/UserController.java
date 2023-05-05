package appmobiledev.ui.controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @RequestMapping( "/hello" )
    public String echo() {
        return "Hello World! usr cont";
    }

}


