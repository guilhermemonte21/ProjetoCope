package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.UploadVideo;

public class UploadVideoUrlOutput {

    private final String uploadUrl;

    public UploadVideoUrlOutput(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }
}
