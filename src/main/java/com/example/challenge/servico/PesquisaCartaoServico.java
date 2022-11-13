package com.example.challenge.servico;

import com.example.challenge.entidade.Cartao;
import com.example.challenge.excecao.SemConteudoExcecao;
import com.example.challenge.persistencia.CartaoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PesquisaCartaoServico {
    @Autowired
    private CartaoRepositorio cartaoRepositorio;

    public Cartao executar(String identificador){
        return cartaoRepositorio.findIdentificador(identificador).orElseThrow(SemConteudoExcecao::new);
    }
}
