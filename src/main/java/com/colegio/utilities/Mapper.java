package com.colegio.utilities;

import com.colegio.dto.*;
import com.colegio.jpa.entity.*;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class Mapper {

    public ProfesorDTO toProfesorDTO(Profesor profesor) {
        return  ProfesorDTO
                .builder()
                .id(profesor.getId())
                .nombre(profesor.getNombre())
                .asignaturas(profesor.getAsignaturas().stream()
                        .map(this::toAsignaturaDTO)
                        .collect(Collectors.toList()))
                .build();
    }

    public AsignaturaDTO toAsignaturaDTO(Asignatura asignatura) {
        return AsignaturaDTO
                .builder()
                .id(asignatura.getId())
                .nombre(asignatura.getNombre())
                .profesor(toProfesorDTO(asignatura.getProfesor()))
                .estudiantes(       asignatura.getEstudiantes().stream()
                        .map(this::toEstudianteDTO)
                        .collect(Collectors.toList()))
                .build();
    }

    public EstudianteDTO toEstudianteDTO(Estudiante estudiante) {
        return EstudianteDTO
                .builder()
                .id(estudiante.getId())
                .nombre(estudiante.getNombre())
                .build();
    }

    public CursoDTO toCursoDTO(Curso curso) {
        return CursoDTO
                .builder()
                .id(curso.getId())
                .grado(curso.getGrado())
                .salon(curso.getSalon())
                .build();
    }

    public ColegioDTO toColegioDTO(Colegio colegio) {
        return ColegioDTO
                .builder()
                .id(colegio.getId())
                .nombre(colegio.getNombre())
                .build();
    }
}
