package br.com.guilhermemonte21.ProjetoCope.Courses.Application.UseCase.Courses.FindCourseById;

import br.com.guilhermemonte21.ProjetoCope.Courses.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;

import java.util.UUID;

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
