package com.patrickproject.gestao_alunos.Services;

import com.patrickproject.gestao_alunos.Repositories.AlunoRepository;
import com.patrickproject.gestao_alunos.entities.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    public AlunoEntity Save(AlunoEntity alunoEntity) {
        return alunoRepository.save(alunoEntity);
    }

    public void Delete(Long id) {
        alunoRepository.deleteById(id);
    }
}
