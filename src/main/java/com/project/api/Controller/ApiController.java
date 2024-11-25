package com.project.api.Controller;
import com.project.api.Model.User;
import com.project.api.DataAccess.UserRepository;
import com.project.api.Services.Implements.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController()
public class ApiController {

    private UserService _userService;
    /*
    public ApiController(UserService userService){
        this._userService=userService;
    }


    @GetMapping("/")
    public String read(){
        return "Hello World";
    }

    @GetMapping("/GetUsers")
    public List<User> GetUsers(){
        return _userService.GetAll();
    }
    */




}
