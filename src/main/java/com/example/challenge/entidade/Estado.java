package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "estado")
@Data
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false)
    private Long id;

    @Column(name = "nome_estado")
    private String nome;
}
