package com.example.challenge.conversores;

import com.example.challenge.entidade.Cartao;
import com.example.challenge.entidade.Cliente;
import com.example.challenge.entidade.Endereco;
import com.example.challenge.requisicao.EnderecoRequisicao;
import com.example.challenge.resposta.RespostaCartao;
import com.example.challenge.resposta.RespostaCliente;

public class ConverterCartaoParaRespostaCartao {
    public static RespostaCartao converte(Cartao cartao) {

        RespostaCartao respostaCartao = new RespostaCartao();
        respostaCartao.setIdNumeroCartao(cartao.getIdNumeroCartao());
        respostaCartao.setCliente(cartao.getCliente());
        respostaCartao.setModalidade(cartao.getModalidade());
        if (cartao.getEnderecoList().isEmpty()) {
            Endereco endereco = cartao.getEnderecoList().iterator().next();
            EnderecoRequisicao enderecoRequisicao = new EnderecoRequisicao();
            enderecoRequisicao.setCep(enderecoRequisicao.getCep());
            enderecoRequisicao.setLogradouro(endereco.getLogradouro());
            enderecoRequisicao.setNumero(enderecoRequisicao.getNumero());
            respostaCartao.setEnderecoRequisicao(enderecoRequisicao);
        }
        return respostaCartao;
    }
}
