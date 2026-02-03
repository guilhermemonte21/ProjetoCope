package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Courses.CreateCourse;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;

public interface ICreateCourse {
    Course Create(Course curso);
}
