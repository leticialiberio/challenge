package com.example.challenge.servico;

import com.example.challenge.conversor.ConverterCartaoParaRespostaCartao;
import com.example.challenge.persistencia.CartaoRepositorio;
import com.example.challenge.persistencia.ClienteRepositorio;
import com.example.challenge.resposta.CartaoResposta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ListarCartaoServico {
    private final CartaoRepositorio cartaoRepositorio;

    public List<CartaoResposta> executar(){
        return cartaoRepositorio.findAll().stream()
                .map(ConverterCartaoParaRespostaCartao::converte).collect(Collectors.toList());
    }
}
