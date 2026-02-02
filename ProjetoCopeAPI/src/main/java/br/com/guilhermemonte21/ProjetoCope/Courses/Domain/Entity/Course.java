package br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Enum.Dificulty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private UUID idCourse;
    private String name;
    private Dificulty dificulty;
    private UUID idInstrutor;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
