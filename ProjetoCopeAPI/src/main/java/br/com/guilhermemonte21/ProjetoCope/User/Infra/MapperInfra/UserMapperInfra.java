package br.com.guilhermemonte21.ProjetoCope.User.Infra.MapperInfra;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import br.com.guilhermemonte21.ProjetoCope.User.Infra.Entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapperInfra implements IUserMapperInfra{

    @Override
    public User toDomain(UserEntity user){
        User user1 = new User(user.getIdUsers(), user.getName(),user.getCpf(),user.getEmail(), user.getSenha(), user.getAtivo(), user.getRole());
        return user1;
    }

    public UserEntity toEntity(User user){
        UserEntity userEntity = new UserEntity(user.getIdUsers(),user.getName(),user.getCpf(), user.getEmail(), user.getSenha(), user.getAtivo(), user.getRole());
        return userEntity;
    }

}
