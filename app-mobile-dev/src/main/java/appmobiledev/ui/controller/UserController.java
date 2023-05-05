package appmobiledev.ui.controller;
import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("users")
public class UserController {

    @GetMapping("/users")
    public String getUser(){
        return "hello Get user method was called";
    }

    @PostMapping("/users")
    public String createUser(){
        return "create user was called";
    }
    @PutMapping
    public String updateUser (){
        return "update user was called ";
    }
    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }

}

