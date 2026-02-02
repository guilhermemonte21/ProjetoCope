package br.com.guilhermemonte21.ProjetoCope.Courses.Infra.Repository;

import br.com.guilhermemonte21.ProjetoCope.Courses.Infra.Entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CourseRepository extends JpaRepository<CourseEntity, UUID> {
    List<CourseEntity> findByIdInstrutor(UUID id);
}
