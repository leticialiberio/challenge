package com.example.challenge.servico;

import com.example.challenge.persistencia.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PesquisaClienteServico {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

//    public Cartao executar(String identificador){
//        return clienteRepositorio
//                .findIdentificador(identificador).orElseThrow(SemConteudoExcecao::new);
//    }
}
