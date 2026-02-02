package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.CreateUser;

import br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway.UserGateway;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import org.springframework.stereotype.Service;

@Service
public class CreateUser implements ICreateUser{

    private final UserGateway gateway;

    public CreateUser(UserGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public User Create(User user) {
        User user1 = gateway.save(user);
        return user1;
    }
}
