package com.patrickproject.gestao_alunos.entities;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoEntity {

    @Id
    long id;
    String name;
    int frequencia;
}
