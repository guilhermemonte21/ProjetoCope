package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Lessons.FindAllByModule;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;

import java.util.List;
import java.util.UUID;

public interface IFindAllByModule {
    List<Lessons> find(UUID idModule);
}
