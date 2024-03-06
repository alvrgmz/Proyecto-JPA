package com.alvaro.proyectojpa;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Embeddable
@NoArgsConstructor @AllArgsConstructor @Data
public class Periodo {
    @Column(name = "fecha_inicio")
    LocalDate fechaInicio;
    @Column(name = "fecha_fin")
    LocalDate fechaFin;
}
