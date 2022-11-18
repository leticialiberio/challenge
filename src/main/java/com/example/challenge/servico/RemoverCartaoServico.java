package com.example.challenge.servico;

import com.example.challenge.conversor.ConverterCartaoParaRespostaCartao;
import com.example.challenge.entidade.Cartao;
import com.example.challenge.persistencia.CartaoRepositorio;
import com.example.challenge.persistencia.ClienteRepositorio;
import com.example.challenge.resposta.CartaoResposta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class RemoverCartaoServico {
    private final CartaoRepositorio cartaoRepositorio;
    private final PesquisarCartaoServico pesquisarCartaoServico;

    @Transactional
    public CartaoResposta executar(String identificador) {
        final Cartao cartao = pesquisarCartaoServico.executar(identificador);

        cartaoRepositorio.delete(cartao);
        return ConverterCartaoParaRespostaCartao.converte(cartao);
    }
}
