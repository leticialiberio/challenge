package com.example.cliente.controllers;

import com.example.challenge.requisicao.RequisicaoCliente;
import com.example.challenge.requisicao.RequisicaoClientePatch;
import com.example.challenge.resposta.RespostaCliente;

import com.example.challenge.servico.ConsultarClienteServico;
import com.example.challenge.servico.IncluirClienteServico;
import com.example.challenge.servico.ListarClienteServico;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/cliente")
@Slf4j
@RequiredArgsConstructor
public class ClienteController {

    private final IncluirClienteServico incluirClienteServico;
    private final ConsultarClienteServico consultarClienteServico;
    private final ListarClienteServico listarClienteServico;


    // http://localhost8080/v1/cliente
    @PostMapping(path = "", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaCliente criarCliente(@RequestBody RequisicaoCliente requisicaoCliente) {
        log.info("Info {}", requisicaoCliente);
        return incluirClienteServico.executar(requisicaoCliente);
    }

    // http://localhost:8080/v1/cliente/<identificador>
    @GetMapping(path= "/{identificador}")
    public RespostaCliente consultarCliente(@PathVariable("identificador") String identificador){
        return consultarClienteServico.executar(identificador);
    }

    // http://localhost:8080/v1/cliente/
    @GetMapping(path= "")
    public List<RespostaCliente> listarClientes(){
        return listarClienteServico.executar();
    }

    // http://localhost:8080/v1/cliente/identificador
    @DeleteMapping(path= "/{identificador}")
   // @ResponseStatus(HttpStatus.ACCEPTED)
    public RespostaCliente removerCliente(@PathVariable("identificador") String identificador){
        return new RespostaCliente();
    }

    // http:localhost:8080/v1/cliente/<identificador>
    @PatchMapping(path = "/identificador")
    public RespostaCliente atualizarCliente(@RequestBody RequisicaoClientePatch clientePatch,
                                            @PathVariable("identificador") String identificador){
        return new RespostaCliente();
    }
}
