package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.WatchLesson;

import br.com.guilhermemonte21.ProjetoCope.Media.Domain.MediaGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.DTO.CreateLessonDTO;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.LessonsGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WatchLesson {
        private final LessonsGateway lessonRepository;
        private final MediaGateway mediaGateway;

    public WatchLesson(LessonsGateway lessonRepository, MediaGateway mediaGateway) {
        this.lessonRepository = lessonRepository;
        this.mediaGateway = mediaGateway;
    }

    public WatchLessonOutput execute(UUID lessonId) {
        Lessons lesson = lessonRepository.findById(lessonId);

        if (lesson.getVideoId() == null) {
            throw new IllegalStateException("Aula sem vídeo");
        }

        String videoUrl = mediaGateway.generateDownloadUrl(
                lesson.getVideoId()
        );

        return new WatchLessonOutput(videoUrl);
    }
        }


