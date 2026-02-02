package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.CreateUser;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;

public interface ICreateUser {
    User Create(User user);
}
