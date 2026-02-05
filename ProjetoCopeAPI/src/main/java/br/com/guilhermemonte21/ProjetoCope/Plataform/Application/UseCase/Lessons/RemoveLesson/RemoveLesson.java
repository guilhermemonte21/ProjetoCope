package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.RemoveLesson;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.LessonsGateway;

import java.util.UUID;

public class RemoveLesson implements IRemoveLesson{

    private final LessonsGateway gateway;

    public RemoveLesson(LessonsGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void Remove(UUID idLesson) {
        gateway.Delete(idLesson);
    }
}
