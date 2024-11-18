package com.colegio.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ProfesorDTO {

    private Long id;
    private String nombre;
    private List<AsignaturaDTO> asignaturas;
}
