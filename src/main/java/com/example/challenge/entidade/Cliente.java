package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
    @Id
    @Column(name = "id_cliente")
    private String cpf;

    @Column(name = "nome_cliente")
    private String nome;

    @OneToMany(mappedBy = "clientes")
    private List<Endereco> enderecoClienteList;
}
