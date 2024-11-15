package br.com.udemy.rafael.unittest.api.service.impl;

import br.com.udemy.rafael.unittest.domain.User;
import br.com.udemy.rafael.unittest.domain.dto.UserDTO;
import br.com.udemy.rafael.unittest.jpa.UserRepository;
import br.com.udemy.rafael.unittest.stubs.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl service;

    @Mock
    private UserRepository repository;

    @Mock
    private ModelMapper mapper;

    static User expectedUser;
    static UserDTO expectedUserDTO;
    static Optional<User> expectedUserOptional;

    static UserStub userStub;
    static UserDTOStub userDTOStub;
    static Optional<UserStub> userStubOptional;

    @BeforeAll
    static void setUp() {
        userStub = new UserStub();
        userDTOStub = new UserDTOStub();
        userStubOptional = Optional.of(userStub);

        expectedUser = userStub.any();
        expectedUserDTO = userDTOStub.any();
        expectedUserOptional = Optional.of(expectedUser);
    }

    @Test
    void whenFindByIdThenReturnAnUserInstance() {
        // Arrange
        when(repository.findById(anyLong())).thenReturn(expectedUserOptional);

        // Act
        User actualResponse = this.service.findById(expectedUser.getId());
        User expected = expectedUserOptional.get();

        // Assert
        assertEquals(User.class, actualResponse.getClass());
        assertEquals(expectedUser, actualResponse);
        assertEquals(expected, actualResponse);
        assertEquals(expected.getId(), actualResponse.getId());
        assertEquals(expected.getEmail(), actualResponse.getEmail());
    }
}