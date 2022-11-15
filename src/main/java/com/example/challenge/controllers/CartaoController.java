package com.example.challenge.controllers;

import com.example.challenge.requisicao.CartaoRequisicao;
import com.example.challenge.requisicao.EnderecoRequisicao;
import com.example.challenge.resposta.CartaoResposta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartao")
@Slf4j
public class CartaoController {

    // http://localhost:8080/cartao
    @PostMapping(path = "", produces = "apllication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarCartao(@RequestBody CartaoRequisicao cartaoRequisicao) {
        log.info("Info {}", cartaoRequisicao);
    }

    // http://localhost:8080/cartao/<numeroCartao>
    @PatchMapping(path = "/{numeroCartao}")
    public CartaoResposta alterarCartao(@RequestBody EnderecoRequisicao enderecoRequisicao,
                                        @PathVariable("numeroCartao") String identificadorCartao) {
        return null;
    }

    // http://localhost:8080/cartao/
    @GetMapping(path = "")
    public List<CartaoResposta> listarCartao() {
        return null;
    }

    // http://localhost:8080/cartao/<numeroCartao>
    @DeleteMapping(path = "/{numeroCartao}")
    public CartaoResposta deletarCartao(@PathVariable("numeroCartao") String identificadorCartao) {
        return null;
    }
}
