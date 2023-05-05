package appmobiledev.ui.controller;
import appmobiledev.service.UserService;
import appmobiledev.shared.dto.UserDto;
import appmobiledev.ui.model.request.UserDetailsRequestModel;
import appmobiledev.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser(){
        return "User's getUser method was called";
    }

//    We will be abele to read the body from http request & then convert the json body into java object using the  @RequestBody which is a special annotation.
//    Now we need to specify the class that will be used to create a java object out of this request Body.
//    Let's say that class is called  UserDetailsRequestModel
//

    @PostMapping   // F#7 Vid #5
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){
        UserRest returnValue = new UserRest();
        UserDto userDto = new UserDto ();
//         It copies properties from source object into target object.
        BeanUtils.copyProperties( userDetails, userDto );



//        Entity class will be used to save dta in the DB.
        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
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

