package com.colegio.service.implementation;

import com.colegio.dto.DetalleProfesorDTO;
import com.colegio.dto.NombreDTO;
import com.colegio.dto.ProfesorDTO;
import com.colegio.jpa.entity.Profesor;
import com.colegio.jpa.repository.ProfesorRepository;
import com.colegio.service.ProfesorService;
import com.colegio.utilities.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProfesorServiceImpl implements ProfesorService {

    private final Mapper mapper;
    private final ProfesorRepository profesorRepository;

    @Override
    public ProfesorDTO profesor(NombreDTO nombreDTO) {
        ProfesorDTO profesor = profesorRepository.findByNombre(nombreDTO.getNombre());
        return profesor;
    }

    @Override
    public List<DetalleProfesorDTO> detalleProfesor(Long profesorId) {
        return profesorRepository.detalleProfesor(profesorId);
    }

    @Override
    public List<ProfesorDTO> getAllProfesores(int page, int size) {
        Page<Profesor> pageProfesor = profesorRepository.findAll(PageRequest.of(page, size));
        return pageProfesor.map(mapper::toProfesorDTO).getContent();
    }
}
