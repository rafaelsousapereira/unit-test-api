package br.com.udemy.rafael.unittest.jpa;

import br.com.udemy.rafael.unittest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
