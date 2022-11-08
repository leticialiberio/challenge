package com.example.challenge.requisicao;

import lombok.Data;

@Data
public class RequisicaoClientePatch {
    private String nome;
    private EnderecoRequisicao enderecoRequisicao;
}
