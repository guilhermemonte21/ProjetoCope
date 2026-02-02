package br.com.guilhermemonte21.ProjetoCope.Lesson.Infra.Repository;

import br.com.guilhermemonte21.ProjetoCope.Lesson.Infra.Entity.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonRepository extends JpaRepository<LessonEntity, UUID> {
}
