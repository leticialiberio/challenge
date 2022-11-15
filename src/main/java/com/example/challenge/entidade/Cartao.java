package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "cartao")
@Data
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartao", nullable = false)
    private Long idNumeroCartao;

    @Column(name = "modalidade")
    private String modalidade;

    @ManyToOne
    @JoinColumn(name = "id_endereco", nullable = false)
    private Endereco enderecoList;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;
}
