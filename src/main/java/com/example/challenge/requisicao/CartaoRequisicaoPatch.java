package com.example.challenge.requisicao;

import com.example.challenge.entidade.Agencia;
import com.example.challenge.entidade.Cliente;
import com.example.challenge.entidade.Conta;
import lombok.Data;

@Data
public class CartaoRequisicaoPatch {
    private String modalidade;
    private Cliente cliente;
    private Agencia agencia;
    private Conta conta;
    private EnderecoRequisicao enderecoRequisicao;

}
