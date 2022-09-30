package com.moja.airline.contoller.mvc.user;

import com.moja.airline.bean.HelloWorldBean;
import com.moja.airline.entity.user.User;
import com.moja.airline.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

    @Controller
    public class UserController {

        @Autowired
        private UserService userService;

        @Autowired
        private HelloWorldBean helloWorldBean;


        @Autowired
        private BCryptPasswordEncoder passwordEncoder;

        @GetMapping("/")
        public String viewUsers(Model model) {
            List<User>users=userService.getAllUsers();
            model.addAttribute("user", users);
            return "index";
        }

        @GetMapping("/login")
        public String login(){
            System.out.println("HelloWorldBean-UserController: " + helloWorldBean.hashCode());

            return "login";
        }

        //http://localhost:8081/register
        @GetMapping("/register")
        public String showNewUserForm(Model model) {
            User user = new User();
            model.addAttribute("user", user);
            return "register";
        }

        //http://localhost:8081/saveUser
        @PostMapping("/saveUser")
        public String saveUser(@ModelAttribute("user") User user) {
            try {
                String plainPassword = user.getPassword();
                String hashedPassword = passwordEncoder.encode(plainPassword);
                user.setPassword(hashedPassword);
                user.setRole("USER");
                userService.saveUser(user);
                return "redirect:/index";
            } catch (Exception e) {
                return "redirect:/register?error=Bad registration";
            }
        }
    }
