package com.example.challenge.servico;

import com.example.challenge.resposta.RespostaCliente;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarClienteServico {
    public RespostaCliente executar(String identificador) {
        RespostaCliente respostaCliente = new RespostaCliente();
        respostaCliente.setIdentificador(UUID.randomUUID().toString());
        return respostaCliente;
    }
}
