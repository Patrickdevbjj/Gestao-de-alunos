package com.patrickproject.gestao_alunos.Controllers;

import com.patrickproject.gestao_alunos.Repositories.AlunoRepository;
import com.patrickproject.gestao_alunos.Services.AlunoService;
import com.patrickproject.gestao_alunos.entities.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private AlunoRepository alunoRepository;


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

    @PutMapping(value = "/{id}")
    public ResponseEntity<AlunoEntity> updateAluno(@PathVariable Long id, @RequestBody AlunoEntity alunoEntity) {
        Optional<AlunoEntity> alunoOptional = Optional.ofNullable(alunoRepository.findById(id));
        if (alunoOptional.isPresent()) {
            AlunoEntity alunoExistente = alunoOptional.get();
            alunoExistente.setEmail(alunoEntity.getEmail());
            alunoRepository.save(alunoExistente);
            return ResponseEntity.ok(alunoExistente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
