package com.example.exerciciojpa01.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Usuario {
    @Id
    private Long id;
    private String nome;

    @ManyToOne
    private Endereco endereco;


}
