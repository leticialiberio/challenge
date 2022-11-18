package com.example.challenge.servico;

import com.example.challenge.conversor.ConverterCartaoParaRespostaCartao;
import com.example.challenge.entidade.Cartao;
import com.example.challenge.persistencia.CartaoRepositorio;
import com.example.challenge.persistencia.ClienteRepositorio;

import com.example.challenge.requisicao.CartaoRequisicao;
import com.example.challenge.requisicao.CartaoRequisicaoPatch;
import com.example.challenge.resposta.CartaoResposta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AlterarCartaoServico {
    private final CartaoRepositorio cartaoRepositorio;
    private final PesquisarCartaoServico pesquisarCartaoServico;

    public CartaoResposta executar(CartaoRequisicao cartaoRequisicao, String identificador){
       Cartao cartao = pesquisarCartaoServico.executar(identificador);
       if (Objects.nonNull(cartao.getIdNumeroCartao())){
           cartao.setIdNumeroCartao(cartaoRequisicao.getIdNumeroCartao());
       }
       cartaoRepositorio.save(cartao);
       return ConverterCartaoParaRespostaCartao.converte(cartao);
    }
}
