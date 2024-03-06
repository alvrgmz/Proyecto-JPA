package com.alvaro.proyectojpa.repository;

import com.alvaro.proyectojpa.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository  extends JpaRepository<Departamento, Long> {
}
