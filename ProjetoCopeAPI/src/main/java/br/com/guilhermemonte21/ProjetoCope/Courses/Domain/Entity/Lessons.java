package br.com.guilhermemonte21.ProjetoCope.Courses.Domain.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "lessons")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lessons {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer position;

    @Column(name = "video_id")
    private UUID videoId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "module_id")
    private Modules module;
}
