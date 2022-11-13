package com.example.challenge.resposta;

import com.example.challenge.requisicao.RequisicaoCartao;
import lombok.Data;

@Data
public class RespostaCartao extends RequisicaoCartao {
    private String identificador;
}
