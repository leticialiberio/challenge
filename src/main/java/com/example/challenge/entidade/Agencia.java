package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "agencia")
@Data
public class Agencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroAgencia;

    @Column(name = "nome_agencia")
    private String nomeAgencia;

    @OneToOne(mappedBy = "endereco")
    private Endereco enderecoAgencia;
}
