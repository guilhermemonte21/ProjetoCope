package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.UpdateTitleLesson;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.LessonsGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import java.util.UUID;

public class UpdateTitleLesson implements IUpdateTitleLesson{
    private final LessonsGateway gateway;

    public UpdateTitleLesson(LessonsGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Lessons Update(UUID idLesson, String newTitle) {
        Lessons l = gateway.findById(idLesson);
        l.setTitle(newTitle);
        Lessons salvo = gateway.save(l);
        return salvo;
    }
}
