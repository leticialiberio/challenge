package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {
    @Id
    @Column(name = "id_cliente", nullable = false)
    private String cpf;

    @Column(name = "nome_cliente")
    private String nome;

    @OneToMany
    @JoinColumn(name = "endereco_cliente", nullable = false)
    private List<Endereco> enderecoClienteList;

    @ManyToMany
    @JoinColumn(name = "id_conta", nullable = false)
    private List<Conta> contaList;

    @OneToMany
    @JoinColumn(name = "id_cartao", nullable = false)
    private List<Cartao> cartaoList;
}
