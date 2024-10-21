package br.com.udemy.rafael.unittest.api.service.impl;

import br.com.udemy.rafael.unittest.domain.User;
import br.com.udemy.rafael.unittest.domain.dto.UserDTO;
import br.com.udemy.rafael.unittest.jpa.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    public static final int ID = 1;
    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Mock
    private UserRepository userRepository;

    @Mock
    private ModelMapper mapper;

    private User user;
    private UserDTO userDTO;
    private Optional<User> userOptional;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUsers();
    }

    private ModelMapper modelMapper;

    @Test
    void testFindById() {
    }

    private void startUsers() {
        user = new User(ID, "Rafael", "rafael@mail.com", "654321");
        user = new User(ID, "Gabriela", "gabriela@mail.com", "123456");
        userOptional = Optional.of(new User(ID, "Gabriela", "gabriela@mail.com", "123456"));
    }
}