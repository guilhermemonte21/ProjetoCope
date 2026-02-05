package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Modules.CreateModule;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.CoursesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.ModulesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Course;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;

public class CreateModule implements ICreateModule{
    private final ModulesGateway ModGateway;
    private final CoursesGateway CourseGateway;

    public CreateModule(ModulesGateway modGateway, CoursesGateway courseGateway) {
        ModGateway = modGateway;
        CourseGateway = courseGateway;
    }

    @Override
    @Transactional
    public Modules Create(UUID idCourse, String Title) {
        Course curso = CourseGateway.findById(idCourse);
        Modules mod = curso.addModule(Title);
        CourseGateway.save(curso);
        return mod;
    }
}
