package br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;

import java.util.UUID;

public interface UserGateway {
    User save(User user);
    User FindById(UUID id);
    User findByEmail(String email);
}
