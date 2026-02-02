package br.com.guilhermemonte21.ProjetoCope.Courses.Application.Gateway;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;

import java.util.List;
import java.util.UUID;

public interface CoursesGateway {
    Course save(Course course);
    void delete(UUID id);
    Course findById(UUID id);
    List<Course> findByIdInstrutor(UUID id);
}
