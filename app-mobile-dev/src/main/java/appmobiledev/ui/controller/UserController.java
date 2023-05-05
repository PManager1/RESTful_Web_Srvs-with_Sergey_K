package appmobiledev.ui.controller;
import appmobiledev.ui.model.request.UserDetailsRequestModel;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "hello Get user method was called";
    }

//    We will be abele to read the body from http request & then convert the json body into java object using the  @RequestBody which is a special annotation.
//    Now we need to specify the class that will be used to create a java object out of this request Body.
//    Let's say that class is called  UserDetailsRequestModel
//

    @PostMapping
    public String createUser(@RequestBody UserDetailsRequestModel userDetails){
        return "create user was called-3";
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

