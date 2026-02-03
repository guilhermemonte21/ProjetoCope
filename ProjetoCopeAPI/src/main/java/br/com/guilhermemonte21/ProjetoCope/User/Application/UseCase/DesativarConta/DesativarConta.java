package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.DesativarConta;

import br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway.UserGateway;
import br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.FindUserByEmail.IFindByEmail;
import br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.Login.ILogin;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import org.springframework.security.access.AccessDeniedException;

public class DesativarConta implements IDesativarConta{

    private final ILogin login;
    private final UserGateway gateway;
    private final IFindByEmail findByEmail;

    public DesativarConta(ILogin login, UserGateway gateway, IFindByEmail findByEmail) {
        this.login = login;
        this.gateway = gateway;
        this.findByEmail = findByEmail;
    }

    @Override
    public User Desativar(String Email, String Senha) {
        Boolean logado = login.Login(Email, Senha);
        if(!logado){
            throw new AccessDeniedException("Você precisa estar logado");
        }
        User user = findByEmail.FindByEmail(Email);
        user.setAtivo(false);
        return gateway.save(user);
    }
}
