package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "estado")
@Data
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_estado", nullable = false)
    private Long idEstado;

    @Column(name = "nome_estado")
    private String nomeEstado;
}
