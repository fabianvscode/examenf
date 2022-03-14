package com.fabian.accesored.controller;


import com.fabian.accesored.Modelo.RoleDto;
import com.fabian.accesored.Service.Impl.RoleServiceImpl;
import com.fabian.accesored.Service.Impl.UserServiceImpl;
import com.fabian.accesored.entity.Role;
import com.fabian.accesored.entity.User;
import com.fabian.accesored.repository.RoleRepository;
import com.fabian.accesored.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;


@RestController
@RequestMapping("access/v1")
public class UserController {

    private static final Logger log = Logger.getLogger(String.valueOf(UserController.class));

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private RoleServiceImpl roleService;

    @PostMapping("/create/user")
    public ResponseEntity<User> create(@RequestBody User user)throws Exception{
        log.info(">>> access/v1 usuario creado");
        Object create = userService.registerUser(user);
        return new ResponseEntity(create, HttpStatus.CREATED);
    }

    @GetMapping("/viewrol")
    public ResponseEntity<String>ver()throws Exception{
        log.info(">>>>> vista roles");
        Object v= roleService.viewRol();
        return new ResponseEntity(v, HttpStatus.OK);
    }
    @PostMapping("/createrol")
    public ResponseEntity<RoleDto>createRol(@RequestBody RoleDto roleDto)throws Exception{
        log.info(">>>>> create rol");
        Object createRol = roleService.createRol(roleDto);
        return new ResponseEntity(createRol, HttpStatus.CREATED);
    }


}
