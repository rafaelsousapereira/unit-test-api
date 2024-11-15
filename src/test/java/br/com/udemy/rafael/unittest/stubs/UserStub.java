package br.com.udemy.rafael.unittest.stubs;

import br.com.udemy.rafael.unittest.domain.User;

import java.util.UUID;

public class UserStub {

    public User any() {

        return User.builder()
                .id(1L)
                .name("Fulano da Silva")
                .email("fulano@gmail.com")
                .password("1234")
                .build();
    }
}
