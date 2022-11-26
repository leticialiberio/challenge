package com.example.challenge.servico;

import com.example.challenge.entidade.*;
import com.example.challenge.persistencia.*;
import com.example.challenge.requisicao.CartaoRequisicao;
import com.example.challenge.requisicao.EnderecoRequisicao;
import com.example.challenge.resposta.CartaoResposta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class IncluirCartaoServico {

    private final CartaoRepositorio cartaoRepositorio;
    private final ClienteRepositorio clienteRepositorio;
    private final EnderecoRepositorio enderecoRepositorio;
    private final ContaRepositorio contaRepositorio;
    private final AgenciaRepositorio agenciaRepositorio;


    public CartaoResposta executar(CartaoRequisicao cartaoRequisicao) {
        CartaoResposta cartaoResposta = new CartaoResposta();
        cartaoResposta.setIdentificadorCartao(UUID.randomUUID().toString());
        Conta contaResultado = contaRepositorio.save(cartaoRequisicao.getConta());
        Agencia agenciaResultado = agenciaRepositorio.save(cartaoRequisicao.getAgencia());



        Cliente cliente = new Cliente();
        cliente.setContaList(List.of(contaResultado));
        cliente.setNome(cartaoRequisicao.getCliente().getNome());
        cliente.setCpf(cartaoRequisicao.getCliente().getCpf());
        cliente.setContaList(cartaoRequisicao.getCliente().getContaList());
        clienteRepositorio.save(cliente);

        Cartao cartao = new Cartao();
        cartao.setCliente(cartaoRequisicao.getCliente());
        cartao.setIdNumeroCartao(cartao.getIdNumeroCartao());
        cartao.setModalidade(cartaoRequisicao.getModalidade());
        cartaoRepositorio.save(cartao);

        Endereco endereco = new Endereco();
        endereco.setCep(cartaoRequisicao.getEnderecoRequisicao().getCep());
        endereco.setLogradouro(cartaoRequisicao.getEnderecoRequisicao().getLogradouro());
        endereco.setNumero(cartaoRequisicao.getEnderecoRequisicao().getNumero());
        endereco.setComplemento(cartaoRequisicao.getEnderecoRequisicao().getComplemento());
        endereco.setBairro(cartaoRequisicao.getEnderecoRequisicao().getBairro());
        endereco.setCidade(cartaoRequisicao.getEnderecoRequisicao().getCidade());
        endereco.setEstado(cartaoRequisicao.getEnderecoRequisicao().getEstado());
        endereco.setId(cartaoRequisicao.getEnderecoRequisicao().getId());

        cartaoResposta.setCliente(cartaoRequisicao.getCliente());
        cartaoResposta.setIdNumeroCartao(cartaoRequisicao.getIdNumeroCartao());

        EnderecoRequisicao enderecoRequisicao = new EnderecoRequisicao();
        enderecoRequisicao.setLogradouro(cartaoRequisicao.getEnderecoRequisicao().getLogradouro());
        enderecoRequisicao.setNumero(cartaoRequisicao.getEnderecoRequisicao().getNumero());
        enderecoRequisicao.setCep(cartaoRequisicao.getEnderecoRequisicao().getCep());
        enderecoRequisicao.setId(cartaoRequisicao.getEnderecoRequisicao().getId());
        enderecoRepositorio.save(cartao);

        return cartaoResposta;
    }

}