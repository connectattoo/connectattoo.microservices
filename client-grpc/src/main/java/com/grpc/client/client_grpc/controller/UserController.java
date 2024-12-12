package com.grpc.client.client_grpc.controller;

import com.google.protobuf.Descriptors;
import com.grpc.client.client_grpc.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    private UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/people/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getAuthor (@PathVariable String id) {
        return userService.getAuthor(Integer.parseInt(id));
    }

}
