package com.colegio.jpa.repository;

import com.colegio.dto.DetalleProfesorDTO;
import com.colegio.dto.ProfesorDTO;
import com.colegio.jpa.entity.Profesor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

    @Query("SELECT new com.colegio.dto.ProfesorDTO(p.id, p.nombre) FROM Profesor p WHERE p.nombre = :nombre")
    ProfesorDTO findByNombre(@Param("nombre") String nombre);

    @Query("SELECT new com.colegio.dto.DetalleProfesorDTO(p.id, p.nombre, a.id, a.nombre, e.id, e.nombre) " +
            "FROM Profesor p " +
            "JOIN p.asignaturas a " +
            "LEFT JOIN a.estudiantes e " +
            "WHERE p.id = :profesorId")
    List<DetalleProfesorDTO> detalleProfesor(@Param("profesorId") Long profesorId);
    Page<Profesor> findAll(Pageable pageable);
}
