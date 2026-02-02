package br.com.guilhermemonte21.ProjetoCope.Courses.Infra.GatewayImpl;

import br.com.guilhermemonte21.ProjetoCope.Courses.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;

import java.util.List;
import java.util.UUID;

public class CoursesGatewayImpl implements CoursesGateway {
    @Override
    public Course save(Course course) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Course findById(UUID id) {
        return null;
    }

    @Override
    public List<Course> findByIdInstrutor(UUID id) {
        return List.of();
    }
}
