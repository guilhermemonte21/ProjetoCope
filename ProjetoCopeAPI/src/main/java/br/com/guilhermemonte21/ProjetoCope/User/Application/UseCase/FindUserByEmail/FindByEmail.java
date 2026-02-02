package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.FindUserByEmail;

import br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway.UserGateway;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;

public class FindByEmail implements IFindByEmail{

    private final UserGateway gateway;

    public FindByEmail(UserGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public User FindByEmail(String Email) {
       return gateway.findByEmail(Email);
    }
}
