package com.colegio.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class AsignaturaDTO {

    private Long id;
    private String nombre;
    private ProfesorDTO profesor;
    private List<EstudianteDTO> estudiantes;
}
