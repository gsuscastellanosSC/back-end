package com.colegio.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NombreDTO implements Serializable {
    @NonNull
    private String nombre;
}
