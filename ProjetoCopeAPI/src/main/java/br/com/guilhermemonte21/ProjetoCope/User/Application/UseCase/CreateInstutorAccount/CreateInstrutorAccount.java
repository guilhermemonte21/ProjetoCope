package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.CreateInstutorAccount;
import br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway.UserGateway;
import br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.FindUserByEmail.IFindByEmail;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Enum.Role;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

@Service
public class CreateInstrutorAccount implements ICreateInstrutorAccount{

    private final IFindByEmail findByEmail;
    private final UserGateway gateway;

    public CreateInstrutorAccount( IFindByEmail findByEmail, UserGateway gateway) {

        this.findByEmail = findByEmail;
        this.gateway = gateway;
    }

    public User CreateInstrutorAccount(String Email, String Senha){
//        Boolean logado = login.Login(Email, Senha);
//        if (!logado){
//            throw new AccessDeniedException("Você precisa estar logado");
//        }
        User user = findByEmail.FindByEmail(Email);
        user.setRole(Role.Instrutor);
        return gateway.save(user);
    }
}
