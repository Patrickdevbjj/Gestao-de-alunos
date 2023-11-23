package com.patrickproject.gestao_alunos.Controllers;

import com.patrickproject.gestao_alunos.entities.AlunoEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    public ResponseEntity<AlunoEntity> findAll() {
    AlunoEntity alunoEntity = new AlunoEntity(1234,"Patrick", 80);
    return ResponseEntity.ok().body(alunoEntity);
    }
}
