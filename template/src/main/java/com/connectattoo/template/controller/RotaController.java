package com.connectattoo.template.controller;

import com.connectattoo.template.model.UserModel;
import com.connectattoo.template.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RotaController {

    private final UserService userService;
    
    @GetMapping("/rota")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/save")
    public ResponseEntity<UserModel> saveUser (@RequestBody UserModel user) {
        UserModel userSaved = userService.saveUser(user);
        return ResponseEntity.status(201).body(userSaved);
    }
}
