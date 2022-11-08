package com.example.challenge.resposta;

import com.example.challenge.requisicao.RequisicaoCliente;
import lombok.Data;

@Data
public class RespostaCliente extends RequisicaoCliente {
    private String identificador;

}
