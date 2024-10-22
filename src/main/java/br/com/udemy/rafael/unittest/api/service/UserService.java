package br.com.udemy.rafael.unittest.api.service;

import br.com.udemy.rafael.unittest.domain.User;
import br.com.udemy.rafael.unittest.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User create(UserDTO dto);

    User findById(Integer id);

    List<User> findAll();
}
