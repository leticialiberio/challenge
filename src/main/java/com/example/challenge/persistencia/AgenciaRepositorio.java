package com.example.challenge.persistencia;

import com.example.challenge.entidade.Agencia;
import com.example.challenge.entidade.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenciaRepositorio extends JpaRepository<Agencia, Long> {


}
