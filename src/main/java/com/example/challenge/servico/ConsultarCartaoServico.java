package com.example.challenge.servico;

import com.example.challenge.cliente.consultaCEP;
import com.example.challenge.conversor.ConverterCartaoParaRespostaCartao;
import com.example.challenge.entidade.Cartao;
import com.example.challenge.entidade.Endereco;
import com.example.challenge.persistencia.EnderecoRepositorio;
import com.example.challenge.resposta.CartaoResposta;
import com.example.challenge.resposta.EnderecoResposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultarCartaoServico {
    @Autowired
    private PesquisarCartaoServico pesquisarCartaoServico;
    @Autowired
    private EnderecoRepositorio enderecoRepositorio;
    @Autowired
    private consultaCEP consultaCEP;

    public CartaoResposta executar(String identificador){
        Cartao cartao = pesquisarCartaoServico.executar(identificador);
        Endereco endereco = enderecoRepositorio.findByCartao(cartao);
        cartao.setEndereco(endereco);
        EnderecoResposta enderecoResposta = consultaCEP.getCep(cartao.getEndereco().getCep());

        final CartaoResposta cartaoResposta = ConverterCartaoParaRespostaCartao.converte(cartao);
        return cartaoResposta;
    }
}
