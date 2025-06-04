package com.ufg.socc.Repositorio;

import com.ufg.socc.Entidades.Disciplina;
import com.ufg.socc.Entidades.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    List<Disciplina> findAll();
}
