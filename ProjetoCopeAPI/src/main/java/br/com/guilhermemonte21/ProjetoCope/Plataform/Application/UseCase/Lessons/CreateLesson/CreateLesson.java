package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.CreateLesson;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.DTO.CreateLessonDTO;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.ModulesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;

import java.util.UUID;

public class CreateLesson implements ICreateLesson{
    private final ModulesGateway gateway;

    public CreateLesson(ModulesGateway gateway) {
        this.gateway = gateway;
    }


    @Override
    public Lessons Create(UUID Module, CreateLessonDTO dto) {
        Modules mod = gateway.findById(Module);
        Lessons lessons = mod.addLesson(dto);
        gateway.save(mod);
        return lessons;
    }
}
