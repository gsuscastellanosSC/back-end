package com.colegio.controller;

import com.colegio.dto.DetalleProfesorDTO;
import com.colegio.dto.NombreDTO;
import com.colegio.dto.ProfesorDTO;
import com.colegio.service.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProfesorController {

    private final ProfesorService profesorService;

    @GetMapping(
            path ="/profesor",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ProfesorDTO getProfesor(@RequestBody NombreDTO nombreDTO) {
        return profesorService.profesor(nombreDTO);
    }
    @GetMapping("/detalleProfesor/{profesorId}")
    public List<DetalleProfesorDTO> getDetalleProfesor(@PathVariable Long profesorId) {
        return profesorService.detalleProfesor(profesorId);
    }

    @GetMapping
    public List<ProfesorDTO> getAllProfesores(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        return profesorService.getAllProfesores(page, size);
    }
}
