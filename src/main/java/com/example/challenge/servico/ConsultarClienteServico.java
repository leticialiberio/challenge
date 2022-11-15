package com.example.challenge.servico;

import com.example.challenge.cliente.ConsultaCEPCliente;
import com.example.challenge.persistencia.EnderecoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultarClienteServico {
    @Autowired
    private PesquisaClienteServico pesquisaClienteServico;
    @Autowired
    private EnderecoRepositorio enderecoRepositorio;
    @Autowired
    private ConsultaCEPCliente consultaCEPCliente;

//    public RespostaCliente executar(String identificador) {
//        Cliente cliente = pesquisaClienteServico.executar(identificador);
////        Endereco endereco = enderecoRepositorio.findByCliente(cliente);
////        cliente.setEnderecoList(List.of(endereco));
//       EnderecoResposta enderecoResposta= consultaCEPCliente
//               .getCep(cliente.getEnderecoList().iterator().next().getCep());
//       final RespostaCliente respostaCliente = ConverterClienteParaRespostaCliente.converte(cliente);
//       return respostaCliente;
//    }
}
