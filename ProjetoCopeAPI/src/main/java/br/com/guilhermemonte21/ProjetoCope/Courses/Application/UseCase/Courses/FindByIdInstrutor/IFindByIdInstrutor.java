package br.com.guilhermemonte21.ProjetoCope.Courses.Application.UseCase.Courses.FindByIdInstrutor;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;

import java.util.List;
import java.util.UUID;

public interface IFindByIdInstrutor {
    List<Course> cursos(UUID id);
}
