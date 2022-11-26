package com.example.challenge.persistencia;

import com.example.challenge.entidade.Cartao;
import com.example.challenge.entidade.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContaRepositorio extends JpaRepository<Conta, Integer> {

}
