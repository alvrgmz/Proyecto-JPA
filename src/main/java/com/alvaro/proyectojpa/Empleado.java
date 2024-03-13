package com.alvaro.proyectojpa;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;
@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    Long id_empleado;
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
    @Column (name="sal", precision=7, scale=2)
    BigDecimal salario;
    @Column(name="comm", precision=7, scale=2)
    BigDecimal comision;
    // Many objetos Empleado se relacionan
    // con One objeto Departamento
    @ManyToOne
    @JoinColumn (
            name="id_dept",
            foreignKey = @ForeignKey(
            name = "FK_emp_dept_id_dept")
    )
    Departamento departamento;
    @ManyToMany
    @JoinTable(
            name = "emp_proy",
            joinColumns = {@JoinColumn(name = "id_emp",
                    foreignKey = @ForeignKey(name = "FK_emp_proy_id_emp"))},
            inverseJoinColumns = @JoinColumn(name = "id_proy",
                    foreignKey = @ForeignKey(name = "FK_emp_proy_id_proy"))
    )
    Set<Proyecto> listaProyectos;

}


