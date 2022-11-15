package com.example.challenge.resposta;

import com.example.challenge.requisicao.CartaoRequisicao;
import lombok.Data;

@Data
public class CartaoResposta extends CartaoRequisicao {
    private String identificadorCartao;
}
