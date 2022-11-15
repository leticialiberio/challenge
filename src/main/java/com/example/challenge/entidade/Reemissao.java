package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "reemissao")
@Data
public class Reemissao {
    @Id
    @Column(name = "id_reemissao",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReemissao;

    @ManyToOne
    @JoinTable(name = "cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinTable(name = "cartao")
    private Cartao cartao;

    @ManyToOne
    @JoinTable(name = "endereco_cliente")
    private Endereco enderecoClienteList;

}
