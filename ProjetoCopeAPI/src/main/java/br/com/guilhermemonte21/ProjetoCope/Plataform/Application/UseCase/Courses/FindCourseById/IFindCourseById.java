package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Courses.FindCourseById;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;

import java.util.UUID;

public interface IFindCourseById {
    Course findById(UUID Id);
}
