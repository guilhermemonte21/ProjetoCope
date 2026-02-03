package br.com.guilhermemonte21.ProjetoCope.Courses.Application.UseCase.Courses.CreateCourse;

import br.com.guilhermemonte21.ProjetoCope.Courses.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;

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
