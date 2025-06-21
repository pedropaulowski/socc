package com.ufg.socc.Services;

import com.ufg.socc.Entidades.Docente;
import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;

import java.util.List;

public interface DocenteService {
    List<Docente> listar();
    List<Docente> listarPorNucleoConhecimento(NucleoConhecimentoEntidade nucleoConhecimento);
}