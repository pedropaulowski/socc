package com.ufg.socc.Controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/nucleo_conhecimento")
public class NucleoConhecimento {

    @GetMapping("/{id}")
    public ResponseEntity<NucleoConhecimento> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<NucleoConhecimento>> listar() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
