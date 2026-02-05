package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.WatchLesson;

import java.util.UUID;

public interface IWatchLesson {
   WatchLessonOutput execute(UUID lessonId);
}
