package br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "modules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Modules {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(
            mappedBy = "module",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Lessons> lessons = new ArrayList<>();


    public void addLesson(Lessons lesson) {
        lesson.setModule(this);
        lessons.add(lesson);
    }

    public void removeLesson(UUID lessonId) {
        lessons.removeIf(l -> l.getId().equals(lessonId));
    }
}
