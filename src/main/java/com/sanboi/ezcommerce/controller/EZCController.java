package com.sanboi.ezcommerce.controller;

import com.sanboi.ezcommerce.entity.User;
import com.sanboi.ezcommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EZCController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user/save")
    public ResponseEntity<String> saveUser(@RequestBody User cur_user) {
        System.out.println(cur_user);
        userRepository.save(cur_user);
        return ResponseEntity.ok("User Registration Successfull!");
    }
}
