package br.com.udemy.rafael.unittest.api.controller;

import br.com.udemy.rafael.unittest.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
         return ResponseEntity.ok().body(new User(1, "Rafael", "rafael@mail.com", "1234"));
    }
}
