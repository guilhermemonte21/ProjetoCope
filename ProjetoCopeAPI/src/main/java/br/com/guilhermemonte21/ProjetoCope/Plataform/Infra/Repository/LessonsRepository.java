package br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.Repository;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface LessonsRepository extends JpaRepository<Lessons, UUID> {
    @Query("""
        select l
        from Lessons l
        where l.module.id = :moduleId
    """)
    List<Lessons> findAllByModuleId(UUID moduleId);
}

