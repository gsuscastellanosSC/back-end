package com.colegio.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CursoDTO {

    private Long id;
    private int grado;
    private String salon;
    private List<AsignaturaDTO> asignaturas;
}
