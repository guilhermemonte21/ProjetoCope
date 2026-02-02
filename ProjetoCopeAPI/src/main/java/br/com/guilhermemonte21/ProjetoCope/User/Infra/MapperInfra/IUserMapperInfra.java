package br.com.guilhermemonte21.ProjetoCope.User.Infra.MapperInfra;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import br.com.guilhermemonte21.ProjetoCope.User.Infra.Entity.UserEntity;

public interface IUserMapperInfra {
    User toDomain(UserEntity userEntity);
    UserEntity toEntity(User user);
}
