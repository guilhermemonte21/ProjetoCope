package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Courses.CreateCourse;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.DTO.CreateCourseDTO;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.MapperApl.CourseMapper;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import org.springframework.stereotype.Service;

@Service
public class CreateCourse implements ICreateCourse{
    private final CoursesGateway gateway;
    private final CourseMapper mapper;

    public CreateCourse(CoursesGateway gateway, CourseMapper mapper) {
        this.gateway = gateway;
        this.mapper = mapper;
    }

    @Override
    public Course Create(CreateCourseDTO curso) {
        Course newCurso = mapper.toDomain(curso);
        Course saved = gateway.save(newCurso);
        return saved;
    }
}
