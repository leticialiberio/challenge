package com.example.challenge.persistencia;

import com.example.challenge.entidade.Cartao;
import com.example.challenge.entidade.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CartaoRepositorio extends JpaRepository<Cartao, String> {

    @Query("Select c FROM Cartao c inner join c.endereco Where c.id_cartao = :identificador")
    Optional<Cartao> findIdentificador(@Param("identificador") String identificador);

    Optional<Cartao> findByIdentificador(String identificador);

    @Modifying
    Long deleteByIdentificador(String identificador);
}
