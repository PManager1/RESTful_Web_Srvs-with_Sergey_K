package appmobiledev.ui.controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "hello Get user method was called";
    }

    @PostMapping
    public String createUser(){
        return "create user was called-2";
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

