package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.FindAllByModule;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.LessonsGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.ModulesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;

import java.util.List;
import java.util.UUID;

public class FindAllByModule implements IFindAllByModule{

    private final LessonsGateway gateway;

    public FindAllByModule(LessonsGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<Lessons> find(UUID idModule) {
        return gateway.findAllByModule(idModule);
    }
}
