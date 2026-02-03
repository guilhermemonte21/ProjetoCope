package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.DesativarConta;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;

public interface IDesativarConta {
    User Desativar(String Email, String Senha);
}
