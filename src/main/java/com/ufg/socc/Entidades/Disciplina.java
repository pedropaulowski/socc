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
    protected Long id;

    protected Integer nucleo_id;
    protected Integer matriz;
    protected Integer ch_teorica;
    protected Integer ch_pratica;
    protected Integer ch_total;
}
