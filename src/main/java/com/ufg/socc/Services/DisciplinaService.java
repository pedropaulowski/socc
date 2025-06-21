package com.ufg.socc.Services;

import com.ufg.socc.Entidades.Disciplina;
import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;

import java.util.List;

public interface DisciplinaService {
    List<Disciplina> listar();

    List<Disciplina> listarPorNucleoConhecimento(Long nucleoConhecimento);
}