package com.colegio.dto;

import lombok.Getter;

@Getter
public class DetalleProfesorDTO {
    private Long profesorId;
    private String profesorNombre;
    private Long asignaturaId;
    private String asignaturaNombre;
    private Long estudianteId;
    private String estudianteNombre;

    public DetalleProfesorDTO(Long profesorId, String profesorNombre, Long asignaturaId, String asignaturaNombre, Long estudianteId, String estudianteNombre) {
        this.profesorId = profesorId;
        this.profesorNombre = profesorNombre;
        this.asignaturaId = asignaturaId;
        this.asignaturaNombre = asignaturaNombre;
        this.estudianteId = estudianteId;
        this.estudianteNombre = estudianteNombre;
    }
}
