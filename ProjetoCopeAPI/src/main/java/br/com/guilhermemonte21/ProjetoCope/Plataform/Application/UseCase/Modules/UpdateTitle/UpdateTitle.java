package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Modules.UpdateTitle;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.ModulesGateway;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Modules;

import java.util.UUID;

public class UpdateTitle implements IUpdateTitle{
    private final ModulesGateway gateway;

    public UpdateTitle(ModulesGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Modules Update(String title, UUID idModule) {
        Modules mod = gateway.findById(idModule);

        mod.setTitle(title);
        return gateway.save(mod);
    }
}
