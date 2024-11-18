package com.colegio.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int grado;
    private String salon;

    @ManyToOne
    @JoinColumn(name = "colegio_id", nullable = false)
    private Colegio colegio;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Asignatura> asignaturas;
}
