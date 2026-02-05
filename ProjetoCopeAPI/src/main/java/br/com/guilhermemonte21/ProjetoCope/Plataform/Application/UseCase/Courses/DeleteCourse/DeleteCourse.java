package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Courses.DeleteCourse;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.CoursesGateway;

import java.util.UUID;

public class DeleteCourse implements IDeleteCourse{
    private final CoursesGateway gateway;

    public DeleteCourse(CoursesGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void Delete(UUID idCourse) {
        gateway.delete(idCourse);
    }
}
