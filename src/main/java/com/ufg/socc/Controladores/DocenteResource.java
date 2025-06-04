package com.ufg.socc.Controladores;

import com.ufg.socc.Entidades.Docente;
import com.ufg.socc.Services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/docentes")
public class DocenteResource {
    @Autowired
    private DocenteService docenteService;

    @GetMapping("/")
    public List<Docente> listar() {
        return docenteService.listar();
    }
}