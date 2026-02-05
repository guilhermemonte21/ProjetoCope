package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.MapperApl;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.DTO.CreateCourseDTO;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;

import java.time.LocalDateTime;

public class CourseMapper {

    public Course toDomain(CreateCourseDTO curso){
        Course newCurso = new Course();
        newCurso.setTitle(curso.Title());
        newCurso.setDescription(curso.descriprtion());
        newCurso.setDificulty(curso.dificulty());
        newCurso.setCreatedAt(LocalDateTime.now());
        return newCurso;
    }
}
