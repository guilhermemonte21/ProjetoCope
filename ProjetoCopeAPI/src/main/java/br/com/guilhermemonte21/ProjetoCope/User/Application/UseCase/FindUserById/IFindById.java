package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.FindUserById;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;

import java.util.UUID;

public interface IFindById {
    User findById(UUID id);
}
