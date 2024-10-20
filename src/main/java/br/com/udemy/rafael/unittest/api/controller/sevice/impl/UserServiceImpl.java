package br.com.udemy.rafael.unittest.api.controller.sevice.impl;

import br.com.udemy.rafael.unittest.api.controller.sevice.UserService;
import br.com.udemy.rafael.unittest.domain.User;
import br.com.udemy.rafael.unittest.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findById(Integer id) {
        Optional<User> user = repository.findById(id);
        return user.orElse(null);
    }
}
