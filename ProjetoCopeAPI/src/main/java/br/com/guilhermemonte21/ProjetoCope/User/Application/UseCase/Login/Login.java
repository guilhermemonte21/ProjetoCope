package br.com.guilhermemonte21.ProjetoCope.User.Application.UseCase.Login;

import br.com.guilhermemonte21.ProjetoCope.User.Application.Gateway.UserGateway;
import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

    @Service
    public class Login implements ILogin{

        private final UserGateway gateway;
        private final PasswordEncoder encoder;

        public Login(UserGateway gateway, PasswordEncoder encoder) {
            this.gateway = gateway;
            this.encoder = encoder;
        }

        @Override
        public Boolean Login(String Email, String Senha) {
            User usuario = gateway.findByEmail(Email);


            boolean senhaCorreta = encoder.matches(Senha, usuario.getSenha());

            return senhaCorreta;
        }
    }

