package com.ufg.socc.Services;

import com.ufg.socc.Entidades.Disciplina;
import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;
import com.ufg.socc.Repositorio.DisciplinaRepository;
import com.ufg.socc.Repositorio.NucleoConhecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaServiceImp implements DisciplinaService{

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private NucleoConhecimentoRepository nucleoConhecimentoRepository;

    @Override
    public List<Disciplina> listar() {
        return disciplinaRepository.findAll();
    }

    @Override
    public List<Disciplina> listarPorNucleoConhecimento(Long nucleo) {
        return disciplinaRepository.findByNucleosConhecimentoId(nucleo);
    }
}
