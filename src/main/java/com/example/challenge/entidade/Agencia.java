package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "agencia")
@Data
public class Agencia {
    @Id
    @Column(name = "id_agencia", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroAgencia;

    @Column(name = "nome_agencia")
    private String nomeAgencia;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco enderecoAgencia;
}
