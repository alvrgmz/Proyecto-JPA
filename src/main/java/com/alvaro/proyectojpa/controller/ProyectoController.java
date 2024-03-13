package com.alvaro.proyectojpa.controller;

import com.alvaro.proyectojpa.Departamento;
import com.alvaro.proyectojpa.repository.DepartamentoRepository;
import com.alvaro.proyectojpa.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin("*")
@RequestMapping("proyecto")
public class ProyectoController {
//    @Autowired
//    ProyectoRepository proyectoRepositorio;
//
//    @GetMapping("listado")
//    public List<Departamento> listadoProyectos(){
//        return proyectoRepositorio.findAll();
//    }
//
//    @GetMapping("/id")
//    public Optional<Departamento> devuelveDepartamentoPorId(@PathVariable long id){
//        return departamentoRepositorio.findById(id);
//    }

}
