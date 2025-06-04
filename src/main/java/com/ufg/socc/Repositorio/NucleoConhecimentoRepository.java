package com.ufg.socc.Repositorio;

import com.ufg.socc.Entidades.NucleoConhecimentoEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NucleoConhecimentoRepository extends JpaRepository<NucleoConhecimentoEntidade, Long> {

    Optional<NucleoConhecimentoEntidade> findById(Long id);

    List<NucleoConhecimentoEntidade> findAll();
}
