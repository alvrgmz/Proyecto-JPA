package com.alvaro.proyectojpa.controller;

import com.alvaro.proyectojpa.Departamento;
import com.alvaro.proyectojpa.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("departamento")
public class DepartamentoController {

    @Autowired
    DepartamentoRepository departamentoRepositorio;

    @GetMapping("listado")
    public List<Departamento> listadoDepartamentos(){
        return departamentoRepositorio.findAll();
    }

    @GetMapping("/id")
    public Optional<Departamento> devuelveDepartamentoPorId(@PathVariable long id){
        return departamentoRepositorio.findById(id);
    }

    @GetMapping("insercion-datos")
    public void insertarDepartamento(){
        Departamento d1 = new Departamento();
        d1.setNombre("IT");
        d1.setLocalidad("albacete");
        d1.setFechaCreacion(LocalDate.of(2010, 10,  10));

        Departamento d2 = new Departamento();
        d2.setNombre("SALES");
        d2.setLocalidad("murcia");
        d2.setFechaCreacion(LocalDate.of(2015, 10,  18));

        departamentoRepositorio.save(d1);
        departamentoRepositorio.save(d2);

    }

}
