package com.example.challenge.servico;

import com.example.challenge.entidade.Cliente;
import com.example.challenge.entidade.Endereco;
import com.example.challenge.persistencia.ClienteRepositorio;
import com.example.challenge.persistencia.EnderecoRepositorio;
import com.example.challenge.requisicao.EnderecoRequisicao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class IncluirClienteServico {

    private final ClienteRepositorio clienteRepositorio;
    private final EnderecoRepositorio enderecoRepositorio;

//    public RespostaCliente executar(RequisicaoCliente requisicaoCliente) {
//        RespostaCliente respostaCliente = new RespostaCliente();
//
//        respostaCliente.setIdentificador(UUID.randomUUID().toString());
//
//        Cliente cliente = new Cliente();
//        cliente.setNome(requisicaoCliente.getNome());
//        cliente.setCpf(requisicaoCliente.getCpf());
//        cliente.setIdentificador(respostaCliente.getIdentificador());
//        clienteRepositorio.save(cliente);
//
//        Endereco endereco = new Endereco();
//        endereco.setCliente(cliente);
//        endereco.setCep(requisicaoCliente.getEnderecoRequisicao().getCep());
//        endereco.setNumero(requisicaoCliente.getEnderecoRequisicao().getNumero().longValue());
//        endereco.setLogradouro(requisicaoCliente.getEnderecoRequisicao().getLogradouro());
//        enderecoRepositorio.save(endereco);
//
//        respostaCliente.setCpf(requisicaoCliente.getCpf());
//        respostaCliente.setNome(requisicaoCliente.getNome());
//
//        EnderecoRequisicao enderecoRequisicao = new EnderecoRequisicao();
//        enderecoRequisicao.setNumero(requisicaoCliente.getEnderecoRequisicao().getNumero());
//        enderecoRequisicao.setLogradouro(requisicaoCliente.getEnderecoRequisicao().getLogradouro());
//        enderecoRequisicao.setCep(requisicaoCliente.getEnderecoRequisicao().getCep());
//
//        return respostaCliente;
//    }
}