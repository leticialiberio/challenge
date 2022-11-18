package com.example.challenge.controllers;

import com.example.challenge.requisicao.CartaoRequisicao;
import com.example.challenge.requisicao.EnderecoRequisicao;
import com.example.challenge.resposta.CartaoResposta;
import com.example.challenge.servico.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartao")
@Slf4j
@RequiredArgsConstructor
public class CartaoController {
    private final IncluirCartaoServico incluirCartaoServico;
    private final ListarCartaoServico listarCartaoServico;
    private final RemoverCartaoServico removerCartaoServico;
    private final ConsultarCartaoServico consultarCartaoServico;

    // http://localhost:8080/cartao
    @PostMapping(path = "", produces = "apllication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CartaoResposta cadastrarCartao(@RequestBody CartaoRequisicao cartaoRequisicao) {
        log.info("Info {}", cartaoRequisicao);
        return incluirCartaoServico.executar(cartaoRequisicao);
    }

    // http://localhost:8080/cartao/<numeroCartao>
    @PatchMapping(path = "/{numeroCartao}")
    public CartaoResposta alterarCartao(@RequestBody EnderecoRequisicao enderecoRequisicao,
                                        @PathVariable("numeroCartao") String identificadorCartao) {
        return new CartaoResposta();
    }

    // http://localhost:8080/cartao/
    @GetMapping(path = "")
    public List<CartaoResposta> listarCartao() {
        return listarCartaoServico.executar();
    }

    @GetMapping(path= "/{numeroCartao}")
    public CartaoResposta consultarCliente(@PathVariable("identificador") String identificadorCartao){
        return consultarCartaoServico.executar(identificadorCartao);
    }

    // http://localhost:8080/cartao/<numeroCartao>
    @DeleteMapping(path = "/{numeroCartao}")
    public CartaoResposta deletarCartao(@PathVariable("numeroCartao") String identificadorCartao) {
        return removerCartaoServico.executar(identificadorCartao);
    }
}
