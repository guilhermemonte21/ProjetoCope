package br.com.guilhermemonte21.ProjetoCope.User.Infra.Entity;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Enum.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @Column(name = "idUser")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idUsers;

    @Column(name = "NameUser")
    private String name;
    @Column(name = "CPFUser")
    private String cpf;
    @Column(name = "EmailUser")
    private String email;
    @Column(name = "SenhaUser")
    private String senha;

    @Column(name = "ativoUser")
    private Boolean ativo;

    @Column(name = "tipoUser")
    @Enumerated(value = EnumType.STRING)
    private Role role;


}
