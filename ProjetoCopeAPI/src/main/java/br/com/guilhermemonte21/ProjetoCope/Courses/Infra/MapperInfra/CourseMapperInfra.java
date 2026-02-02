package br.com.guilhermemonte21.ProjetoCope.Courses.Infra.MapperInfra;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity.Course;
import br.com.guilhermemonte21.ProjetoCope.Courses.Infra.Entity.CourseEntity;

public class CourseMapperInfra {
    public CourseEntity ToEntity(Course course){
        CourseEntity courseEntity = new CourseEntity(course.getIdCourse(), course.getName(), course.getDificulty(),course.getIdInstrutor(), course.getDescription(), course.getCreatedAt(), course.getUpdatedAt());
        return courseEntity;
    }

    public Course toDomain(CourseEntity course){
        Course domain = new Course(course.getIdCourse(), course.getName(), course.getDificulty(),course.getIdInstrutor(), course.getDescription(), course.getCreatedAt(), course.getUpdatedAt());
        return domain;
    }
}
