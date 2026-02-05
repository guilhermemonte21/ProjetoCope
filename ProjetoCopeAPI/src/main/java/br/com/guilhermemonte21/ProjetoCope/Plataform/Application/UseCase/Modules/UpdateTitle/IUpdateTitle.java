package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Modules.UpdateTitle;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;

import java.util.UUID;

public interface IUpdateTitle {
    Modules Update(String title, UUID idModule);
}
