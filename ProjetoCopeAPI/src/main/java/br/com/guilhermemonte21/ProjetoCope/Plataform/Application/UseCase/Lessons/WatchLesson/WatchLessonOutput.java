package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.WatchLesson;

public class WatchLessonOutput {

    private final String videoUrl;

    public WatchLessonOutput(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }
}