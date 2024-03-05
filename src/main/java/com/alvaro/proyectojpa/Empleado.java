package com.alvaro.proyectojpa;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    Long id_empleado;
}
