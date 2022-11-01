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

    @ManyToMany
    @JoinTable(name = "agencia_endereco", joinColumns =
    @JoinColumn(name = "id_agencia", referencedColumnName = "numeroAgencia"),
            inverseJoinColumns = @JoinColumn(name = "id_endereco", referencedColumnName = "id"))
    private Endereco enderecoAgencia;
}
