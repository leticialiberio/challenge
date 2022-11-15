package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cidades")
@Data
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cidade", nullable = false)
    private Long idCidade;

    @Column(name = "nome_cidade")
    private String nomeCidade;
}
