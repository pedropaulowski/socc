package com.ufg.socc.Entidades;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="nucleos_conhecimento")
public class NucleoConhecimentoEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String nome;
    protected String descricao;
    @ManyToMany(targetEntity = Docente.class)
    protected Set docentes;
}
