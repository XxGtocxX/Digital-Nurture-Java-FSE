package com.debanuj.SpringRESTHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.debanuj.SpringRESTHelloWorld.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String helloUser(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/greet")
    public String greetUser(@RequestParam String name) {
        return "Welcome " + name + "!";
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {

        return "User Created: " + user.getName() +
                " Age: " + user.getAge();
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {

        user.setName(user.getName() + " Updated");

        return user;
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {

        return "User with ID " + id + " deleted successfully!";
    }

    @GetMapping("/status")
    public ResponseEntity<String> status() {

        return new ResponseEntity<>("Application is Running!", HttpStatus.OK);

    }
}