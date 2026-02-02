package br.com.guilhermemonte21.ProjetoCope.User.Infra.GatewayImpl;

import br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway.UserGateway;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import br.com.guilhermemonte21.ProjetoCope.User.Infra.Entity.UserEntity;
import br.com.guilhermemonte21.ProjetoCope.User.Infra.MapperInfra.IUserMapperInfra;
import br.com.guilhermemonte21.ProjetoCope.User.Infra.Repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;

import java.util.UUID;

public class UserGatewayImpl implements UserGateway {
    private final UserRepository repository;
    private final IUserMapperInfra mapperInfra;

    public UserGatewayImpl(UserRepository repository, IUserMapperInfra mapperInfra) {
        this.repository = repository;
        this.mapperInfra = mapperInfra;
    }
    @Override
    public User save(User user){
        UserEntity userEntity = repository.save(mapperInfra.toEntity(user));
        return mapperInfra.toDomain(userEntity);
    }
    @Override
    public User FindById(UUID id){
        UserEntity user = repository.findById(id).orElseThrow(
                EntityNotFoundException::new
        );
        return mapperInfra.toDomain(user);
    }
//    public String Login(String email, String senha){
//        User user = mapperInfra.toDomain(repository.findByEmail(email));
//        if (!user.getSenha().matches(encoder.encode(senha))){
//            throw new RuntimeException("Senha Invalida");
//        }
//        return "Logado";
//    }
    @Override
    public User findByEmail(String email){
        User user = mapperInfra.toDomain(repository.findByEmail(email));

        return user;
    }
}
