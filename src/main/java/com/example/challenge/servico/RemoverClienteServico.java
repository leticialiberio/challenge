package com.example.challenge.servico;

import com.example.challenge.persistencia.ClienteRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class RemoverClienteServico {
    private final ClienteRepositorio clienteRepositorio;
    private final PesquisaClienteServico pesquisaClienteServico;

//    @Transactional
//    public RespostaCliente executar(String identificador) {
//        final Cliente cliente = pesquisaClienteServico.executar(identificador);
//
//        clienteRepositorio.delete(cliente);
//        return ConverterClienteParaRespostaCliente.converte(cliente);
//    }
}
