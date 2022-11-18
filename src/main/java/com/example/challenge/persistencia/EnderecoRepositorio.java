package com.example.challenge.persistencia;

import com.example.challenge.entidade.Cartao;
import com.example.challenge.entidade.Cliente;
import com.example.challenge.entidade.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface EnderecoRepositorio extends JpaRepository<Cartao, Long> {
    @Query("Select c FROM Cliente c inner join c.enderecoList Where c.identificador = :identificador")
    Optional<Endereco> findIdentificador(@Param("identificador") String identificador);
    Long deleteByCartao(Cartao cartao);
    Endereco findByCartao(Cartao cartao);
}