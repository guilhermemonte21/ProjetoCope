package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.UploadVideo;

import br.com.guilhermemonte21.ProjetoCope.Media.Domain.MediaGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.LessonsGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;

import java.util.UUID;

public class UploadVideo implements IUploadVideo{

        private final MediaGateway mediaGateway;
        private final LessonsGateway lessonsGateway;

    public UploadVideo(MediaGateway mediaGateway, LessonsGateway lessonsGateway) {
        this.mediaGateway = mediaGateway;
        this.lessonsGateway = lessonsGateway;
    }

    public UploadVideoUrlOutput execute(UUID lessonId) {

            Lessons lesson = lessonsGateway.findById(lessonId);

            String key = "lessons/" + lessonId + "/video.mp4";

            String url = mediaGateway.generateUploadUrl(
                    key,
                    "video/mp4"
            );

            lesson.setVideoId(key);
            lessonsGateway.save(lesson);

            return new UploadVideoUrlOutput(url);
        }
    }


