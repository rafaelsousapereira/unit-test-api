package br.com.udemy.rafael.unittest.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    private Integer id;
    private String name;
    private String email;

    @JsonIgnore
    private String password;
}
