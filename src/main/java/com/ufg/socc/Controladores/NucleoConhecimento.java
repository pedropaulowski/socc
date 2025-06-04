package com.ufg.socc.Controladores;

import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;
import com.ufg.socc.Services.NucleoConhecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/nucleo_conhecimento")
public class NucleoConhecimento {
    @Autowired
    private NucleoConhecimentoService nucleoConhecimentoService;

    @GetMapping("/{id}")
    public NucleoConhecimentoEntidade buscar(@PathVariable Long id) {
        throw new RuntimeException("Metodo não implementado");
    }

    @GetMapping("/")
    public List<NucleoConhecimentoEntidade> buscarTodos() {
        return nucleoConhecimentoService.buscarTodosNucleos();
    }
}
