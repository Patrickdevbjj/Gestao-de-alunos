package com.patrickproject.gestao_alunos.Services;

import com.patrickproject.gestao_alunos.Repositories.AlunoRepository;
import com.patrickproject.gestao_alunos.entities.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    public AlunoEntity Save(AlunoEntity alunoEntity) {
        return alunoRepository.save(alunoEntity);
    }

    public List<AlunoEntity> findAll() {
        return alunoRepository.findAll();
    }
    
    @Transactional
    public void Delete(Long id) {
        alunoRepository.deleteById(id);
    }


    public AlunoEntity update(Long id, AlunoEntity alunoEntity) {
        Optional<AlunoEntity> alunoOptional = Optional.ofNullable(alunoRepository.findById(id));
        if (alunoOptional.isPresent()) {
            AlunoEntity alunoExistente = alunoOptional.get();
            alunoExistente.setEmail(alunoEntity.getEmail());
            return alunoRepository.save(alunoExistente);
        } else {
            return alunoEntity;
        }
    }


}
