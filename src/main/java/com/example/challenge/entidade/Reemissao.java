package com.example.challenge.entidade;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reemissao")
@Data
public class Reemissao {
    @ManyToOne
    @JoinTable(name = "cartao", joinColumns =
    @JoinColumn(name = "id_cartao", referencedColumnName = "idNumeroCartao"))
    private Cartao cartao;

    @ManyToMany
    @JoinTable(name = "cliente_endereco", joinColumns =
    @JoinColumn(name = "id_cliente", referencedColumnName = "cpf"),
            inverseJoinColumns = @JoinColumn(name = "id_endereco", referencedColumnName = "id"))
    private List<Endereco> enderecoClienteList;

}
