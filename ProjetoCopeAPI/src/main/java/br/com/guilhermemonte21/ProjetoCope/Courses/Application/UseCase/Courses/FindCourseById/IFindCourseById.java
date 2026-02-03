package br.com.guilhermemonte21.ProjetoCope.Courses.Application.UseCase.Courses.FindCourseById;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;

import java.util.UUID;

public interface IFindCourseById {
    Course findById(UUID Id);
}
