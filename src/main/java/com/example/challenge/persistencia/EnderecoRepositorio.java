package com.example.challenge.persistencia;

import com.example.challenge.entidade.Cartao;
import com.example.challenge.entidade.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EnderecoRepositorio extends JpaRepository<Endereco, Long> {
    @Query("Select e FROM Endereco Where e.id_endereco = :identificador")
    Optional<Cartao> findIdentificador(@Param("identificador") Long id);

    @Modifying
    Long deleteByIdentificador(String id);
}
