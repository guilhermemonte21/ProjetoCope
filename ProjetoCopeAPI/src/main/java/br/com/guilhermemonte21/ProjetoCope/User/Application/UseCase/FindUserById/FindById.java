package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.FindUserById;

import br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway.UserGateway;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FindById implements IFindById{


    private final UserGateway gateway;

    public FindById( UserGateway gateway) {
        this.gateway = gateway;
    }

    public User findById(UUID id){
        return gateway.FindById(id);
    }
}
