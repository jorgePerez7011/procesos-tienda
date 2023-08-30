package com.procesos.tienda.controller;

import com.procesos.tienda.model.UserModel;
import com.procesos.tienda.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("users/{id}")
public UserModel getUserById(@PathVariable String id){
    UserModel User = new UserModel();
    return User;
}
}
