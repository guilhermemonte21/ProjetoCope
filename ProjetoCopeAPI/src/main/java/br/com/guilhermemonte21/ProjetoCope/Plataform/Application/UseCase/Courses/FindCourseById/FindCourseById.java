package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Courses.FindCourseById;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FindCourseById implements IFindCourseById{

    private final CoursesGateway gateway;

    public FindCourseById(CoursesGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Course findById(UUID Id) {
       Course curso = gateway.findById(Id);
       return curso;
    }
}
