package com.example.challenge.requisicao;

import lombok.Data;

@Data
public class CartaoRequisicao {
    private String cpf;
    private String modalidade;
    private EnderecoRequisicao enderecoRequisicao;
}

