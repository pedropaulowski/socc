package com.ufg.socc.Services;

import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;
import com.ufg.socc.Repositorio.NucleoConhecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NucleoConhecimentoServiceImp implements NucleoConhecimentoService {

    @Autowired
    private NucleoConhecimentoRepository nucleoConhecimentoRepository;


    @Override
    public List<NucleoConhecimentoEntidade> buscarTodosNucleos() {
        return nucleoConhecimentoRepository.findAll();
    }
}
