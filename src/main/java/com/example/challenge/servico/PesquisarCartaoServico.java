package com.example.challenge.servico;

import com.example.challenge.entidade.Cartao;
import com.example.challenge.excecao.SemConteudoExcecao;
import com.example.challenge.persistencia.CartaoRepositorio;
import com.example.challenge.persistencia.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PesquisarCartaoServico {
    @Autowired
    private CartaoRepositorio cartaoRepositorio;

    public Cartao executar(Long identificador){
        return cartaoRepositorio.findIdentificador(identificador).orElseThrow(SemConteudoExcecao::new);
    }
}
