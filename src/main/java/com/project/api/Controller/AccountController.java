package com.project.api.Controller;
import org.springframework.web.bind.annotation.*;

@RestController()
public class AccountController {
       /*
    @Autowired
    private UserRepository _userRepo;

    @PostMapping("/SaveUser")
    public void GetUsers(@RequestBody User user){
        _userRepo.save(user);
    }
    @GetMapping("/GetUser/{id}")
    public ResponseEntity<?> ReturnUser(@PathVariable Long id) {
        try {
            var user = _userRepo.findById(id);
            if (user.isPresent()) {
                return new ResponseEntity<>(user.get(), HttpStatus.OK);  // Return user with 200 OK
            } else {
                return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);  // User not found with 404
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);  // Error with 500
        }
    }
    @GetMapping("/GetUserWithSameAge/{Age}")
    public ResponseEntity<?> returnUserWithSameAge(@PathVariable int Age){


        try{
            List<User> usersWithSameAge = _userRepo.findAll().stream()
                    .filter(user -> user.getAge() == Age)  // Filtra por la edad
                    .toList();
            if(usersWithSameAge.isEmpty()){
                return new ResponseEntity<>("Not found users with same age", HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(usersWithSameAge,HttpStatus.OK);

        }
        catch (Exception e){
            return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }



        return new ResponseEntity<>("Exito man practicando",HttpStatus.OK);
    }
            */

}

