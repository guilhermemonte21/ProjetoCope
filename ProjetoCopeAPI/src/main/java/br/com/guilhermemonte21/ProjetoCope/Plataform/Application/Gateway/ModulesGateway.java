package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;

import java.util.List;
import java.util.UUID;

public interface ModulesGateway {
    Modules save(Modules modules);
    Modules findById(UUID id);
    void Delete(UUID id);
    Modules Update(Modules modules);
    List<Modules> findAllByCourse(UUID idCourse);
}
