package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.UploadVideo;

import java.util.UUID;

public interface IUploadVideo {
    public UploadVideoUrlOutput execute(UUID lessonId);
}
