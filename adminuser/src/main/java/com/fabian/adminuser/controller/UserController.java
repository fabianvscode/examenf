package com.fabian.adminuser.controller;

import com.fabian.adminuser.Service.impl.UserServiceImpl;
import com.fabian.adminuser.entity.UserRed;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("adminUser/V1")
public class UserController {

    private static final Logger log = Logger.getLogger(String.valueOf(UserController.class));

    @Autowired
    UserServiceImpl userService;

    @CircuitBreaker(name = "listUserCB", fallbackMethod = "fallBackGetListUser")
    @GetMapping("/listUser")
    public ResponseEntity<String>listUser() throws Exception{
        Object list = userService.listUser();

        return new ResponseEntity(list, HttpStatus.OK);
    }

    @CircuitBreaker(name = "altaUserCB", fallbackMethod = "fallBackPostAltaUser")
    @PostMapping("/altaUser")
    public ResponseEntity<String>_alteUser(@RequestBody UserRed userRed)throws Exception{
        Object responceUser = userService.createUser(userRed);
        return new ResponseEntity(responceUser, HttpStatus.CREATED);
    }
}
