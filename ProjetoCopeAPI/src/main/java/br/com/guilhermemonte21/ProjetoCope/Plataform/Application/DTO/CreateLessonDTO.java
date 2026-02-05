package br.com.guilhermemonte21.ProjetoCope.Plataform.Application.DTO;

import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Entity.Lessons;
import br.com.guilhermemonte21.ProjetoCope.Plataform.Domain.Enum.Dificulty;

import java.util.UUID;

public record CreateLessonDTO(String Title, UUID videoId) {
}
