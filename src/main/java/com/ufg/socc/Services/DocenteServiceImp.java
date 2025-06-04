package com.ufg.socc.Services;

import com.ufg.socc.Entidades.Docente;
import com.ufg.socc.Repositorio.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DocenteServiceImp implements DocenteService{

    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public List<Docente> listar() {
        return docenteRepository.findAll();
    }
}
