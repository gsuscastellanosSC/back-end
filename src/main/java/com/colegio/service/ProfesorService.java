package com.colegio.service;

import com.colegio.dto.ProfesorDTO;

import java.util.List;

public interface ProfesorService {
    List<ProfesorDTO> getAllProfesores();
    ProfesorDTO getProfesorById(Long id);
}
