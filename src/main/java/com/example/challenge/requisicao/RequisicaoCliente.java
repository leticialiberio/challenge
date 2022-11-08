package com.example.challenge.requisicao;

import lombok.Data;

@Data
public class RequisicaoCliente extends RequisicaoClientePatch{
    private String cpf;
}
