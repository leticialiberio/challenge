package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cartao")
@Data
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNumeroCartao;

    @Column(name = "modalidade")
    private String modalidade;

    @OneToOne
    @JoinTable(name = "endereco", joinColumns =
    @JoinColumn(name = "id_endereco", referencedColumnName = "id"))
    private Endereco localEntrega;

    @OneToOne
    @JoinTable(name = "cliente", joinColumns =
    @JoinColumn(name = "id_cliente", referencedColumnName = "cpf"))
    private Cliente cliente;
}
