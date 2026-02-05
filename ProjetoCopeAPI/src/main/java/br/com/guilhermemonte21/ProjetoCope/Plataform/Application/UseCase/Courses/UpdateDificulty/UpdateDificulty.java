package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Courses.UpdateDificulty;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Enum.Dificulty;
import java.util.UUID;

public class UpdateDificulty implements IUpdateDificulty{

    private final CoursesGateway gateway;

    public UpdateDificulty(CoursesGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Course update(UUID idCourse, Dificulty dificulty) {
        Course c = gateway.findById(idCourse);
        if(c.getDificulty() == dificulty){
            throw new IllegalArgumentException("A dificuldade desse curso já é essa");
        }
        c.setDificulty(dificulty);
        return gateway.save(c);
    }
}
