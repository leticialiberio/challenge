package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "conta")
@Data
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinTable(name = "agencia", joinColumns =
        @JoinColumn(name = "id_agencia", referencedColumnName = "numeroAgencia"))
    private Agencia agencia;

    @ManyToOne
    @JoinTable(name = "cliente", joinColumns =
        @JoinColumn(name = "id_cliente", referencedColumnName = "cpf"))
    private Cliente cliente;

    @ManyToOne
    @JoinTable(name = "cartao", joinColumns =
    @JoinColumn(name = "id_cartao", referencedColumnName = "idNumeroCartao"))
    private Cartao cartao;
}
