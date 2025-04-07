package com.web.web.dto;

import com.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegestationDto userRegestationDto(){
        return new UserRegestationDto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("User")UserRegestationDto userRegestationDto){
        userService.save(userRegestationDto);
        return"redirect:/registration?success";
    }
}
