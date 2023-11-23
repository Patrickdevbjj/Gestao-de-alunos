package com.patrickproject.gestao_alunos.Controllers;

import com.patrickproject.gestao_alunos.entities.AlunoEntity;
import org.springframework.http.ResponseEntity;

public class AlunoController {

    public ResponseEntity<AlunoEntity> findAll() {
    AlunoEntity alunoEntity = new AlunoEntity(1234,"Patrick", 80);
    return ResponseEntity.ok().body(alunoEntity);
    }
}
