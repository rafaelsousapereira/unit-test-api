package br.com.udemy.rafael.unittest.stubs;

import br.com.udemy.rafael.unittest.domain.User;
import br.com.udemy.rafael.unittest.domain.dto.UserDTO;

import java.util.UUID;

public class UserDTOStub {

    public UserDTO any() {

        return UserDTO.builder()
                .id(1L)
                .name("Fulano da Silva DTO")
                .email("fulano.dto@gmail.com")
                .password("123")
                .build();
    }
}
