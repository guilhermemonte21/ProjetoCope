package br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.Repository;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonsRepository extends JpaRepository<Lessons, UUID> {
}
