package br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity;

import br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Enum.Dificulty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "courses")
@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(
            mappedBy = "course",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Modules> modules = new ArrayList<>();

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    public void addModule(Modules module) {
        module.setCourse(this);
        modules.add(module);
    }

    public void removeModule(UUID moduleId) {
        modules.removeIf(m -> m.getId().equals(moduleId));
    }

}

