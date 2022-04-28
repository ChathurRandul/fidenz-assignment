package com.fidenz.test.controller;

import com.fidenz.test.business.custom.UserBO;
import com.fidenz.test.dto.UserDTO;
import com.fidenz.test.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/users")
@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserBO userBO;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> allUsers = userBO.findAllUsers();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Count", allUsers.size() + "");
        return new ResponseEntity<>(allUsers, httpHeaders, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO getUser(@PathVariable String id) {
        try {
            return userBO.findUser(id);
        } catch (NullPointerException e) {
            throw new NotFoundException(e);
        }
    }

    @GetMapping(value = "/searchByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDTO>> getUsersByName(@PathVariable String name) {
        try {
            List<UserDTO> allUsers = userBO.getUsersByName(name);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("X-Count", allUsers.size() + "");
            return new ResponseEntity<>(allUsers, httpHeaders, HttpStatus.OK);
        } catch (NullPointerException e) {
            System.out.println("Not Found");
            throw new NotFoundException(e);
        }
    }

    @GetMapping(value = "/searchZip/{zipCode}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDTO>> getAllUsersByZipCode(@PathVariable String zipCode) {
        try {
            List<UserDTO> allUsers = userBO.getUsersByZipCode(zipCode);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("X-Count", allUsers.size() + "");
            return new ResponseEntity<>(allUsers, httpHeaders, HttpStatus.OK);
        } catch (NullPointerException e) {
            System.out.println("Not Found");
            throw new NotFoundException(e);
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveUser(@RequestBody UserDTO user) {
        userBO.saveUser(user);
        return "\"" + user.getId() + "\"";
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void updateUser(@PathVariable String id,
                           @RequestBody UserDTO user) {
        user.setId(id);
        userBO.updateUser(user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userBO.deleteUser(id);
    }
}
