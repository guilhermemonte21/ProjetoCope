package br.com.guilhermemonte21.ProjetoCope.User.Infra.GatewayImpl;

import br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway.UserGateway;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import br.com.guilhermemonte21.ProjetoCope.User.Infra.Repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;

import java.util.UUID;

public class UserGatewayImpl implements UserGateway {
    private final UserRepository repository;

    public UserGatewayImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user){
        User user1 = repository.save(user);
       return user1;
    }
    @Override
    public User FindById(UUID id){
        User user = repository.findById(id).orElseThrow(
                EntityNotFoundException::new
        );
        return user;
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
        User user = repository.findByEmail(email);

        return user;
    }
}
