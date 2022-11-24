package com.example.challenge.entidade;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<Endereco> enderecoClienteList;

    @ManyToMany
    @JoinColumn(name = "id_conta", nullable = false)
    @JsonIgnore

    private List<Conta> contaList;

    @OneToMany
    @JoinColumn(name = "cartao", nullable = false)
    private List<Cartao> cartaoList;
}
