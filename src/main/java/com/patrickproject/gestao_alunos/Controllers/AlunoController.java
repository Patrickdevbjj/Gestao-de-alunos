package com.patrickproject.gestao_alunos.Controllers;

import com.patrickproject.gestao_alunos.Services.AlunoService;
import com.patrickproject.gestao_alunos.entities.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;


    @GetMapping
    public ResponseEntity<AlunoEntity> findAll() {
    AlunoEntity alunoEntity = new AlunoEntity(1234,"Patrick", 80, "Patrick@gmail.com");
    return ResponseEntity.ok().body(alunoEntity);
    }

    @PostMapping
    public ResponseEntity<AlunoEntity> save(@RequestBody AlunoEntity alunoEntity) {
        AlunoEntity alunoSalvo = alunoService.Save(alunoEntity);
        return ResponseEntity.ok().body(alunoSalvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        alunoService.Delete(id);
        return ResponseEntity.ok().build();
    }
}
