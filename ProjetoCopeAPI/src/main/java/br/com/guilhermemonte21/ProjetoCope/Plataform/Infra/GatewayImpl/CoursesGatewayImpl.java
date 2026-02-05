package br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.GatewayImpl;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.Repository.CourseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
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
        List<Course> courses = repository.findAll();

        return courses;
    }

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }
}
