package br.com.guilhermemonte21.ProjetoCope.Courses.Application.UseCase.Courses.CreateCourse;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;

public interface ICreateCourse {
    Course Create(Course curso);
}
