package com.example.challenge.entidade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "conta")
@Data
public class Conta {
    @Id
    @Column(name = "id_conta",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNumeroConta;

    @ManyToOne
    @JoinTable(name = "agencia")
    private Agencia agencia;

    @ManyToOne
    @JoinTable(name = "cliente")
    @JsonIgnore
    private Cliente cliente;

    @ManyToMany
    @JoinTable(name = "cartao")
    @JsonIgnore
    private List<Cartao> cartaoList;
}
