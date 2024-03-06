package com.alvaro.proyectojpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_dept")
    Long id_departamento;

    String numero;
    String nombre;
    Long localidad;

    @Column(name="fecha_creacion")
    LocalDate fechaCreacion;



}
