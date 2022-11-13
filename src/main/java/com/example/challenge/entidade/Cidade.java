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
    private Long id;

    @Column(name = "nome_cidade")
    private String nome;
}
