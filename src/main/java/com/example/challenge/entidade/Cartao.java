package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cartao")
@Data
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartao")
    private Long idNumeroCartao;

    @Column(name = "modalidade")
    private String modalidade;

    @OneToMany(mappedBy = "cartao")
    private List<Endereco> enderecoList;

    @OneToOne
    @JoinTable(name = "cliente", joinColumns =
    @JoinColumn(name = "id_cliente", referencedColumnName = "cpf"))
    private Cliente cliente;
}
