package com.example.challenge.servico;

import com.example.challenge.entidade.Cliente;
import com.example.challenge.entidade.Endereco;
import com.example.challenge.entidade.Cartao;
import com.example.challenge.persistencia.CartaoRepositorio;
import com.example.challenge.persistencia.ClienteRepositorio;
import com.example.challenge.persistencia.EnderecoRepositorio;
import com.example.challenge.requisicao.CartaoRequisicao;
import com.example.challenge.requisicao.EnderecoRequisicao;
import com.example.challenge.resposta.CartaoResposta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class IncluirCartaoServico {

    private final CartaoRepositorio cartaoRepositorio;
    private final ClienteRepositorio clienteRepositorio;
    private final EnderecoRepositorio enderecoRepositorio;

    public CartaoResposta executar(CartaoRequisicao cartaoRequisicao) {
        CartaoResposta cartaoResposta = new CartaoResposta();

        cartaoResposta.setIdentificadorCartao(UUID.randomUUID().toString());

        Cliente cliente = new Cliente();
        cliente.setNome(cartaoRequisicao.getCliente().getNome());
        cliente.setCpf(cartaoRequisicao.getCliente().getCpf());
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
        endereco.setCidade(cartaoRequisicao.getEnderecoRequisicao().getCidade());
        endereco.setEstado(cartaoRequisicao.getEnderecoRequisicao().getEstado());
        endereco.setId(cartaoRequisicao.getEnderecoRequisicao().getId());
        //enderecoRepositorio.save(endereco);

        cartaoResposta.setCliente(cartaoRequisicao.getCliente());
        cartaoResposta.setIdNumeroCartao(cartaoRequisicao.getIdNumeroCartao());

        EnderecoRequisicao enderecoRequisicao = new EnderecoRequisicao();
        enderecoRequisicao.setLogradouro(cartaoRequisicao.getEnderecoRequisicao().getLogradouro());
        enderecoRequisicao.setNumero(cartaoRequisicao.getEnderecoRequisicao().getNumero());
        enderecoRequisicao.setCep(cartaoRequisicao.getEnderecoRequisicao().getCep());
        enderecoRequisicao.setId(cartaoRequisicao.getEnderecoRequisicao().getId());

        return cartaoResposta;
    }

}