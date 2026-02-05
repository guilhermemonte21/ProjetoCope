package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.UseCase.Modules.RemoveModule;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Application.Gateway.ModulesGateway;

import java.util.UUID;

public class RemoveModule implements IRemoveModule{
    private final ModulesGateway gateway;

    public RemoveModule(ModulesGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void Remove(UUID IdModule) {
        gateway.Delete(IdModule);
    }
}
