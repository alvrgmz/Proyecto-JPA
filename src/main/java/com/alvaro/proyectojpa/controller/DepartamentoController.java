package com.alvaro.proyectojpa.controller;

import com.alvaro.proyectojpa.Departamento;
import com.alvaro.proyectojpa.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
