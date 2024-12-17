package com.kelompokhoki.EnergyMonitoringWeb.controllers;

import com.kelompokhoki.EnergyMonitoringWeb.dto.UserDto;
import com.kelompokhoki.EnergyMonitoringWeb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user")
    public String listUser(Model model){
        List<UserDto> users = userService.findAllUser();
        model.addAttribute("user", users);
        return "user-list";
    }
}
