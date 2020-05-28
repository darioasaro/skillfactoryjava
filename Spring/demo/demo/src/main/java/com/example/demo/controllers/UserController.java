package com.example.demo.controllers;

import com.example.demo.controllers.DTO.UserDTO;
import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    private List<UserDTO>entityToDTO(List<User>users){

        return users.stream()
         .map(user->new UserDTO(user.getId(),user.getUsername(),user.getDni(), user.getEmail()))
         .collect(Collectors.toList());
    }

    @GetMapping("")
    public ResponseEntity<List<UserDTO>>findAll(){
        userService.findAll();
        return new ResponseEntity<List<UserDTO>>(entityToDTO(userService.findAll()), HttpStatus.OK);

    }


    @PostMapping("")
    public ResponseEntity<User> create(@RequestBody @Valid User userInsert){
        Long userCreated = userService.insert(userInsert);
        return new ResponseEntity(userCreated, HttpStatus.CREATED);
    }
}
