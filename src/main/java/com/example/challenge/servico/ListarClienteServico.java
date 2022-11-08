package com.example.challenge.servico;

import com.example.challenge.resposta.RespostaCliente;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class ListarClienteServico {
    public List<RespostaCliente> executar() {
        List<RespostaCliente> respostaClientes = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            RespostaCliente respostaCliente = new RespostaCliente();
            respostaCliente.setIdentificador(UUID.randomUUID().toString());
            return respostaClientes;
        }
        return respostaClientes;
}}
