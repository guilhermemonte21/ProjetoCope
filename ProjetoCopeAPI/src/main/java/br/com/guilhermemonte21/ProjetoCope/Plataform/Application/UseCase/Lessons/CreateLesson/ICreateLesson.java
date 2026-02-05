package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.CreateLesson;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.DTO.CreateLessonDTO;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;

import java.util.UUID;

public interface ICreateLesson {
    Lessons Create(UUID Module, CreateLessonDTO dto);
}
