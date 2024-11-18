package com.colegio.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
@Entity
public class Colegio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "colegio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Curso> cursos;
}
