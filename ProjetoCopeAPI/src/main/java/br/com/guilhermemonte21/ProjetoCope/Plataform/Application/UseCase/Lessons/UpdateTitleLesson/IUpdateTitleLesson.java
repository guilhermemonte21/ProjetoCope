package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.UpdateTitleLesson;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;

import java.util.UUID;

public interface IUpdateTitleLesson {
    Lessons Update(UUID idLesson, String newTitle);
}
