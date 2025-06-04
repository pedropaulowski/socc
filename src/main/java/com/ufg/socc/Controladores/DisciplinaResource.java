package com.ufg.socc.Controladores;

import com.ufg.socc.Entidades.Disciplina;
import com.ufg.socc.Services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/disciplinas")
public class DisciplinaResource {
    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping("/")
    public List<Disciplina> listar() {
        return disciplinaService.listar();
    }
}