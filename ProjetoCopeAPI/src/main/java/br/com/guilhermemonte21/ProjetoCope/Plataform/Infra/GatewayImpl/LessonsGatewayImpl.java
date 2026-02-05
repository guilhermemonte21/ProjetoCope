package br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.GatewayImpl;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.LessonsGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.Repository.LessonsRepository;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.Repository.ModulesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class LessonsGatewayImpl implements LessonsGateway {
    private final LessonsRepository repository;


    public LessonsGatewayImpl(LessonsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Lessons save(Lessons lessons) {
        return repository.save(lessons);
    }

    @Override
    public Lessons findById(UUID id) {
        Lessons les = repository.findById(id).orElseThrow(
                () ->  new EntityNotFoundException("Aula não encontrada")
        );
        return les;
    }

    @Override
    public void Delete(UUID id) {
       Lessons les =  repository.findById(id).orElseThrow(
               () ->  new EntityNotFoundException("Aula não encontrada")
       );
      repository.delete(les);

    }

    @Override
    public Lessons Update(Lessons lessons) {
        return null;
    }

    @Override
    public List<Lessons> findAllByModule(UUID idModule) {
        return repository.findAllByModuleId(idModule);
    }
}
