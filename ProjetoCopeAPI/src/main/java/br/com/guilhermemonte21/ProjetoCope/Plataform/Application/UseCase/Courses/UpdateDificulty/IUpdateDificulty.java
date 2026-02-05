package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Courses.UpdateDificulty;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Enum.Dificulty;

import java.util.UUID;

public interface IUpdateDificulty {
    Course update(UUID idCourse, Dificulty dificulty);
}
