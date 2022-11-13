package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
@Data
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_endereco")
    private Long id;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private Long numero;

    @Column(name = "cep")
    private String cep;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_agencia")
    private Agencia agencia;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

}
