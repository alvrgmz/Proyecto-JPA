package com.alvaro.proyectojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_proy")
    Long idProyecto;
    String numero;
    String nombre;
    @Embedded
    Periodo periodo;
    /*
    @Column(name="fecha_inicio")
    LocalDate = fechaInicio
    @Column(name = "fecha_fin")
    LocalDate fechaFin;
     */

    @ManyToMany(mappedBy = "listaProyectos")
    Set<Empleado> listaEmpleados;
}
