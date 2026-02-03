package br.com.guilhermemonte21.ProjetoCope.User.Infra.Repository;

import br.com.guilhermemonte21.ProjetoCope.User.Domain.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByEmail(String Email);
}
