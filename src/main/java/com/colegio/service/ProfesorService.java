package com.colegio.service;

import com.colegio.dto.DetalleProfesorDTO;
import com.colegio.dto.NombreDTO;
import com.colegio.dto.ProfesorDTO;

import java.util.List;

public interface ProfesorService {

    ProfesorDTO profesor(NombreDTO nombreProfesor);
    List<DetalleProfesorDTO> detalleProfesor(Long profesorId);
    List<ProfesorDTO> getAllProfesores(int page, int size);
}
