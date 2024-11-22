package com.project.api.Controller;
import com.project.api.Model.User;
import com.project.api.Services.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController()
public class ApiController {

    private UserRepository _userRepository;

    public ApiController(UserRepository userRepository){
        this._userRepository= userRepository;
    }


    @GetMapping("/")
    public String read(){
        return "Hello World";
    }

    @GetMapping("/GetUsers")
    public List<User> GetUsers(){
        return _userRepository.findAll();
    }





}
