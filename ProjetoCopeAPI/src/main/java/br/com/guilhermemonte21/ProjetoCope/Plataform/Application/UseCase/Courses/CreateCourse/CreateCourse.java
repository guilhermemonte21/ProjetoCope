package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Courses.CreateCourse;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import org.springframework.stereotype.Service;

@Service
public class CreateCourse implements ICreateCourse{
    private final CoursesGateway gateway;

    public CreateCourse(CoursesGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Course Create(Course curso) {
        Course newCurso = gateway.save(curso);
        return newCurso;
    }
}
