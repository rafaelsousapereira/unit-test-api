package br.com.udemy.rafael.unittest.api.controller;

import br.com.udemy.rafael.unittest.api.service.UserService;
import br.com.udemy.rafael.unittest.domain.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private ModelMapper mapper;

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
        var user = service.findById(id);

        return ResponseEntity.ok().body(mapper.map(user, UserDTO.class));
    }
}
