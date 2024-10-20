package br.com.udemy.rafael.unittest.api.service;

import br.com.udemy.rafael.unittest.domain.User;

public interface UserService {

    User findById(Integer id);
}
