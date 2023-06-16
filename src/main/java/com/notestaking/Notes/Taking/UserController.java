package com.notestaking.Notes.Taking;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path= "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path= "/{userId}")
    public @ResponseBody Optional<User> getUserById(@PathVariable int userId){
        return userRepository.findById(userId);
    }
    
}
