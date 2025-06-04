package com.ufg.socc.Services;

import com.ufg.socc.Entidades.Disciplina;
import com.ufg.socc.Repositorio.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DisciplinaServiceImp implements DisciplinaService{

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Override
    public List<Disciplina> listar() {
        return disciplinaRepository.findAll();
    }
}
