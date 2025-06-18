package com.ufg.socc.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name= "disciplina")
@Entity
public class Disciplina {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer nucleo_id;
    private Integer matriz;
    private Integer ch_teorica;
    private Integer ch_pratica;
    private Integer ch_total;
}
