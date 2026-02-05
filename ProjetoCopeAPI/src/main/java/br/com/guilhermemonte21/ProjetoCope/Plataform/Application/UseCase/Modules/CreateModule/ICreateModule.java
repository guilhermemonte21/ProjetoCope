package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Modules.CreateModule;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;

import java.util.UUID;

public interface ICreateModule {
    Modules Create(UUID idCourse, String Title);
}
