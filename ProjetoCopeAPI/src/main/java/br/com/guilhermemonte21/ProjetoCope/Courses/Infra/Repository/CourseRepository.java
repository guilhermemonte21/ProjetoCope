package br.com.guilhermemonte21.ProjetoCope.Courses.Infra.Repository;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
    List<Course> findByIdInstrutor(UUID id);
}
