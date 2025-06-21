package com.ufg.socc.Services;

import com.ufg.socc.Entidades.Docente;
import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;
import com.ufg.socc.Repositorio.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImp implements DocenteService{

    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public List<Docente> listar() {
        return docenteRepository.findAll();
    }

    @Override
    public List<Docente> listarPorNucleoConhecimento(NucleoConhecimentoEntidade nucleoConhecimento) {
        return docenteRepository.findByNucleosConhecimentoEquals(nucleoConhecimento);
    }


}
