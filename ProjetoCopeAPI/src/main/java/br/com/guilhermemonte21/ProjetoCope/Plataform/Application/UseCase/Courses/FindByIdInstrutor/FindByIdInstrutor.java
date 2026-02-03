package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Courses.FindByIdInstrutor;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
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
