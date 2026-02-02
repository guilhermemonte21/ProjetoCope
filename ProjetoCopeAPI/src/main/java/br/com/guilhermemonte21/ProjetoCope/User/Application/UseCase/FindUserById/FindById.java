package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.FindUserById;

import br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway.UserGateway;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import br.com.guilhermemonte21.ProjetoCope.User.Infra.MapperInfra.UserMapperInfra;

import java.util.UUID;

public class FindById implements IFindById{

    private final UserMapperInfra mapperInfra;
    private final UserGateway gateway;

    public FindById(UserMapperInfra mapperInfra, UserGateway gateway) {
        this.mapperInfra = mapperInfra;
        this.gateway = gateway;
    }

    public User findById(UUID id){
        return gateway.FindById(id);
    }
}
