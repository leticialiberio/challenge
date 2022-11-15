package com.example.challenge.servico;

import com.example.challenge.persistencia.ClienteRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ListarClienteServico {
    private final ClienteRepositorio clienteRepositorio;

//    public List<RespostaCliente> executar() {
//
//       /* List<RespostaCliente> respostaClienteList = new ArrayList<>();
//        for (Cliente cliente : clienteRepositorio.findAll()) {
//            respostaClienteList.add(ConverterClienteParaRespostaCliente.converte(cliente));
//        }
//
//        return respostaClienteList; */
//
//        return clienteRepositorio.findAll().stream()
//                .map(ConverterClienteParaRespostaCliente::converte).collect(Collectors.toList());
//    }
}
