package com.example.challenge.servico;

import com.example.challenge.persistencia.ClienteRepositorio;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AlterarClienteServico {
    private final ClienteRepositorio clienteRepositorio;
    private final PesquisaClienteServico pesquisaClienteServico;
//
//    public RespostaCliente executar(RequisicaoClientePatch clientePatch, String identificador) {
//
//        Cliente cliente = pesquisaClienteServico.executar(identificador);
//        if (Objects.nonNull(cliente.getNome())) {
//            cliente.setNome(clientePatch.getNome());
//        }
//        clienteRepositorio.save(cliente);
//
//        return ConverterClienteParaRespostaCliente.converte(cliente);
//    }
}
