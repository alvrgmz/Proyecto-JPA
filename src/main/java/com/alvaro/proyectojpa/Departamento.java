package com.alvaro.proyectojpa;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="dept", catalog="emp_dept")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_emp")
    Long id_departamento;
    @Column(name="empno")
    String numero;
    @Column(name="ename")
    String apellido;
    @Column(name="job")
    String oficio;
    @Column(name="hiredate")
    LocalDate fechaContratacion;
    @ManyToOne
    @JoinColumn(name="mgr", foreignKey = @ForeignKey(name = "FK_DEPT_MGR"))
    Empleado jefe;


}
