package com.ufg.socc.Entidades;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="nucleos_conhecimento")
public class NucleoConhecimentoEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nome;

    @ManyToMany(targetEntity = Docente.class)
    public Set docentes;
}
