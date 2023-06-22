package com.example.exerciciojpa01.Repository;


import com.example.exerciciojpa01.Entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query ("SELECT e FROM Endereco e WHERE e.cidade = :cidade")
    List<Endereco> findByCidade(String cidade);

    List<Endereco>  findAllByCep (String cep);
    List<Endereco>  findAllByRua (String rua);
}
