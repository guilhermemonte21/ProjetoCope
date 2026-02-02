package br.com.guilhermemonte21.ProjetoCope.Courses.Infra.Entity;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Enum.Dificulty;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Courses")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseEntity {
    private UUID idCourse;
    private String name;
    private Dificulty dificulty;
    private UUID idInstrutor;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
