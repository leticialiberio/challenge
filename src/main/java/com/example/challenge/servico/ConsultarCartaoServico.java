package com.example.challenge.servico;

import com.example.challenge.cliente.ConsultaCEPCliente;
import com.example.challenge.conversores.ConverterCartaoParaRespostaCartao;
import com.example.challenge.entidade.Cartao;
import com.example.challenge.entidade.Cliente;
import com.example.challenge.persistencia.EnderecoRepositorio;
import com.example.challenge.resposta.EnderecoResposta;
import com.example.challenge.resposta.RespostaCartao;
import com.example.challenge.resposta.RespostaCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarCartaoServico {
    @Autowired
    private PesquisaCartaoServico pesquisaCartaoServico;
    @Autowired
    private EnderecoRepositorio enderecoRepositorio;
    @Autowired
    private ConsultaCEPCliente consultaCEPCliente;

    public RespostaCartao executar(String identificador) {
        Cartao cartao = pesquisaCartaoServico.executar(identificador);
        EnderecoResposta enderecoResposta = consultaCEPCliente
                .getCep(cartao.getEnderecoList().iterator().next().getCep());
        final RespostaCartao respostaCartao = ConverterCartaoParaRespostaCartao.converte(cartao);
        return respostaCartao;
    }
}
