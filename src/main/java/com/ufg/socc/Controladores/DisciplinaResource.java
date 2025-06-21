package com.ufg.socc.Controladores;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ufg.socc.Entidades.Disciplina;
import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;
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

    @GetMapping("/nucleo_conhecimento/{nucleo_conhecimento}")
    public List<Disciplina> listarDocentesPorNucleoConhecimento(@PathVariable Long nucleo_conhecimento) {
        return disciplinaService.listarPorNucleoConhecimento(nucleo_conhecimento);
    }
}