package com.ufg.socc.Repositorio;

import com.ufg.socc.Entidades.Disciplina;
import com.ufg.socc.Entidades.Docente;
import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    @EntityGraph(attributePaths = {"nucleosConhecimento"})
    List<Disciplina> findAll();

    @Query("SELECT d FROM Disciplina d JOIN d.nucleosConhecimento n WHERE n.id = :id")
    List<Disciplina> findByNucleosConhecimentoId(Long id);
}
