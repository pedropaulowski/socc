package com.ufg.socc.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="nucleos_conhecimento")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class NucleoConhecimentoEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    @JsonIgnore
    @ManyToMany(targetEntity = Docente.class)
    private Set docentes;

    @JsonIgnore
    @ManyToMany(targetEntity = Disciplina.class)
    private Set disciplina;

    // public void setId(Long id) {
    //     this.id = id;
    // }
}