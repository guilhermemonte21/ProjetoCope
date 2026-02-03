package br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.Repository;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModulesRepository extends JpaRepository<Modules, UUID> {
}
