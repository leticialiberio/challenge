package com.example.challenge.requisicao;

import com.example.challenge.entidade.Cidade;
import com.example.challenge.entidade.Estado;
import lombok.Data;

@Data
public class EnderecoRequisicaoPatch {
    private Long id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private Cidade cidade;
    private Estado estado;
}
