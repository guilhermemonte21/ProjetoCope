package br.com.guilhermemonte21.ProjetoCope.Courses.Infra.GatewayImpl;

import br.com.guilhermemonte21.ProjetoCope.Courses.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;
import br.com.guilhermemonte21.ProjetoCope.Courses.Infra.Repository.CourseRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;

public class CoursesGatewayImpl implements CoursesGateway {
    private final CourseRepository repository;

    public CoursesGatewayImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Course save(Course course) {
        Course salvo = repository.save(course);
        return salvo;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Course findById(UUID id) {
        Course entity = repository.findById(id).orElseThrow(
                () ->  new EntityNotFoundException("Curso não encontrado")
        );
        return entity;
    }

    @Override
    public List<Course> findByIdInstrutor(UUID id) {
        List<Course> courses = repository.findByIdInstrutor(id);

        return courses;
    }
}
