package com.colegio.jpa.repository;

import com.colegio.jpa.entity.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
interface ColegioRepository extends JpaRepository<Colegio, Long> {
}
