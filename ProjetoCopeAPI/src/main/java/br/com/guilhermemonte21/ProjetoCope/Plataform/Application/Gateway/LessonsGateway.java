package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;

import java.util.List;
import java.util.UUID;

public interface LessonsGateway {
    Lessons save(Lessons lessons);
    Lessons findById(UUID id);
    void Delete(UUID id);
    Lessons Update(Lessons lessons);
    List<Lessons> findAllByModule(UUID idModule);
}
