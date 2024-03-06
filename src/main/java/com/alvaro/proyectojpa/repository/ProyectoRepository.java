package com.alvaro.proyectojpa.repository;


import com.alvaro.proyectojpa.Periodo;
import com.alvaro.proyectojpa.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    public List<Proyecto> findByFechaInicioandFechaFin(LocalDate fechaInicio, LocalDate fechaFin);

    public List<Proyecto> findByPeriodo(Periodo periodo);

    public List<Proyecto> findByPeriodoBetween(LocalDate fechaInicio, LocalDate fechaFin);
}
