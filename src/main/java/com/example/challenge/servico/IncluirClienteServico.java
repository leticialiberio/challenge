package com.example.challenge.servico;

import com.example.challenge.entidade.Cliente;
import com.example.challenge.entidade.Endereco;
import com.example.challenge.persistencia.ClienteRepositorio;
import com.example.challenge.persistencia.EnderecoRepositorio;
import com.example.challenge.requisicao.EnderecoRequisicao;
import com.example.challenge.requisicao.RequisicaoCliente;
import com.example.challenge.resposta.RespostaCliente;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IncluirClienteServico {

    private final ClienteRepositorio clienteRepositorio;
    private final EnderecoRepositorio enderecoRepositorio;

    public IncluirClienteServico(ClienteRepositorio clienteRepositorio, EnderecoRepositorio enderecoRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
        this.enderecoRepositorio = enderecoRepositorio;
    }

    public RespostaCliente executar(RequisicaoCliente requisicaoCliente){
        RespostaCliente respostaCliente = new RespostaCliente();
        respostaCliente.setIdentificador(UUID.randomUUID().toString());

        Cliente cliente = new Cliente();
        cliente.setCpf(requisicaoCliente.getCpf());
        cliente.setNome(requisicaoCliente.getNome());
        clienteRepositorio.save(cliente);

        Endereco endereco = new Endereco();
        endereco.setCliente(cliente);
        endereco.setLogradouro(requisicaoCliente.getEnderecoRequisicao().getLogradouro());
        endereco.setNumero(requisicaoCliente.getEnderecoRequisicao().getNumero().longValue());
        enderecoRepositorio.save(endereco);


        EnderecoRequisicao enderecoRequisicao = new EnderecoRequisicao();
        enderecoRequisicao.setCep(requisicaoCliente.getEnderecoRequisicao().getCep());
        enderecoRequisicao.setNumero(requisicaoCliente.getEnderecoRequisicao().getNumero());
        enderecoRequisicao.setLogradouro(requisicaoCliente.getEnderecoRequisicao().getLogradouro());

        return respostaCliente;
    }
}