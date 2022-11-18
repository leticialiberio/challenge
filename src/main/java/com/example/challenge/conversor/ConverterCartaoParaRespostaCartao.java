package com.example.challenge.conversor;

import com.example.challenge.entidade.Cartao;
import com.example.challenge.entidade.Endereco;
import com.example.challenge.requisicao.EnderecoRequisicao;
import com.example.challenge.resposta.CartaoResposta;

public class ConverterCartaoParaRespostaCartao {
    public static CartaoResposta converte(Cartao cartao) {

        CartaoResposta cartaoResposta = new CartaoResposta();
        cartaoResposta.setCliente(cartao.getCliente());
        cartaoResposta.setIdentificadorCartao(String.valueOf(cartao.getIdNumeroCartao()));
        cartaoResposta.setModalidade(cartao.getModalidade());
        if (!(cartao.getEndereco() == null)){
            Endereco endereco = cartao.getEndereco();
            EnderecoRequisicao enderecoRequisicao = new EnderecoRequisicao();
            enderecoRequisicao.setCep(endereco.getCep());
            enderecoRequisicao.setLogradouro(endereco.getLogradouro());
            enderecoRequisicao.setNumero(endereco.getNumero());
        }
        return cartaoResposta;
    }
}
