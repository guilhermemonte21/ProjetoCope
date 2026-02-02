package br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Enum.Role;
import br.com.guilhermemonte21.ProjetoCope.User.Infra.Entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private UUID idUsers;
    private String name;
    private String cpf;
    private String email;
    private String senha;
    private Boolean ativo;
    private Role role;


}
