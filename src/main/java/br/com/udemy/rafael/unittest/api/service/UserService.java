package br.com.udemy.rafael.unittest.api.service;

import br.com.udemy.rafael.unittest.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
