package com.example.challenge.requisicao;

import com.example.challenge.entidade.Cliente;
import lombok.Data;

@Data
public class RequisicaoCartaoPatch {
    private String modalidade;
    private Cliente cliente;
    private EnderecoRequisicao enderecoRequisicao;
}
