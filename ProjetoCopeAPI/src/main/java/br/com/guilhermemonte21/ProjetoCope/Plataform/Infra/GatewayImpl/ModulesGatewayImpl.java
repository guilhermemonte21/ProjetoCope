package br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.GatewayImpl;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.ModulesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.Repository.CourseRepository;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Infra.Repository.ModulesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ModulesGatewayImpl implements ModulesGateway {

    private final ModulesRepository repository;
    private final CourseRepository courseRepository;

    public ModulesGatewayImpl(ModulesRepository repository, CourseRepository courseRepository) {
        this.repository = repository;
        this.courseRepository = courseRepository;
    }

    @Override
    public Modules save(Modules modules) {
        Modules m = repository.save(modules);
        return m;
    }

    @Override
    public Modules findById(UUID id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Modulo não encontrado")
        );
    }

    @Override
    public void Delete(UUID id) {
        Modules m = repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Modulo não encontrado")
        );
        repository.delete(m);
    }

    @Override
    public Modules Update(Modules modules) {
        return null;
    }

    @Override
    public List<Modules> findAllByCourse(UUID idCourse) {
        Course courser = courseRepository.findById(idCourse).orElseThrow(
                () ->  new EntityNotFoundException("Modulo não encontrado")
        );
        return courser.getModules();
    }
}
