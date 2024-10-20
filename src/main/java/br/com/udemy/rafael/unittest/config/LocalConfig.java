package br.com.udemy.rafael.unittest.config;

import br.com.udemy.rafael.unittest.domain.User;
import br.com.udemy.rafael.unittest.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    private final UserRepository repository;

    @Autowired
    public LocalConfig(UserRepository repository) {
        this.repository = repository;
    }

    @Bean
    public List<User> startDB() {
        User u1 = new User(null, "Gabriela", "gabriela@mail.com", "123456");
        User u2 = new User(null, "Rafael", "rafael@mail.com", "654321");

        return repository.saveAll(List.of(u1, u2));
    }
}
