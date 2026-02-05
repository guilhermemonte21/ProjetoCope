package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.DTO;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Enum.Dificulty;

public record CreateCourseDTO(String Title, String descriprtion, Dificulty dificulty) {
}
