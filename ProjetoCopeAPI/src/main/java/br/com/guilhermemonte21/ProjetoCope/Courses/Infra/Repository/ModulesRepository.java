package br.com.guilhermemonte21.ProjetoCope.Courses.Infra.Repository;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Modules;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModulesRepository extends JpaRepository<Modules, UUID> {
}
