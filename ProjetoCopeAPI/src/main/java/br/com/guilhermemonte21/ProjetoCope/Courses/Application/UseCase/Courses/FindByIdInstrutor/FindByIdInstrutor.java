package br.com.guilhermemonte21.ProjetoCope.Courses.Application.UseCase.Courses.FindByIdInstrutor;

import br.com.guilhermemonte21.ProjetoCope.Courses.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;

import java.util.List;
import java.util.UUID;

public class FindByIdInstrutor implements IFindByIdInstrutor{

    private final CoursesGateway gateway;

    public FindByIdInstrutor(CoursesGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<Course> cursos(UUID id) {
        return gateway.findByIdInstrutor(id);
    }
}
