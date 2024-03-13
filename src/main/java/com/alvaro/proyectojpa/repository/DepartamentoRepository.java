package com.alvaro.proyectojpa.repository;

import com.alvaro.proyectojpa.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartamentoRepository  extends JpaRepository<Departamento, Long> {
    public List<Departamento> findByLocalidad(String localidad);
}
