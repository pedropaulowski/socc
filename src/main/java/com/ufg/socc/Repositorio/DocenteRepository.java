package com.ufg.socc.Repositorio;

import com.ufg.socc.Entidades.Disciplina;
import com.ufg.socc.Entidades.Docente;
import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DocenteRepository extends JpaRepository<Docente, Long> {
    List<Docente> findAll();

    List<Docente> findByNucleosConhecimentoEquals(@Param("NUCLEOS_CONHECIMENTO_ID") NucleoConhecimentoEntidade nucleoConhecimentoId);


    @Query("SELECT d FROM Docente d JOIN d.nucleosConhecimento n WHERE n.id = :id")
    List<Docente> findByNucleosConhecimentoId(Long id);
}
