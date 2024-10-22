package br.com.udemy.rafael.unittest.api.service.impl;

import br.com.udemy.rafael.unittest.api.service.UserService;
import br.com.udemy.rafael.unittest.api.service.exceptions.ObjectNotFoundException;
import br.com.udemy.rafael.unittest.domain.User;
import br.com.udemy.rafael.unittest.domain.dto.UserDTO;
import br.com.udemy.rafael.unittest.jpa.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final ModelMapper mapper;

    @Autowired
    public UserServiceImpl(UserRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public User create(UserDTO dto) {
        return this.repository.save(mapper.map(dto, User.class));
    }

    @Override
    public User findById(Integer id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return this.repository.findAll();
    }
}
