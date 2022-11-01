package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
    @Id
    private String cpf;
    @Column(name = "nome_cliente")
    private String nome;

    @ManyToMany
    @JoinTable(name = "cliente_endereco", joinColumns =
    @JoinColumn(name = "id_cliente", referencedColumnName = "cpf"),
            inverseJoinColumns = @JoinColumn(name = "id_endereco", referencedColumnName = "id"))
    private List<Endereco> enderecoClienteList;
}
