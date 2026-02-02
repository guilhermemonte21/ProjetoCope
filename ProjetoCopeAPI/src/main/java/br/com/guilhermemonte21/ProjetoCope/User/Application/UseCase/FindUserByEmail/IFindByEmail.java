package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.FindUserByEmail;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;

public interface IFindByEmail {
    User FindByEmail(String Email);
}
