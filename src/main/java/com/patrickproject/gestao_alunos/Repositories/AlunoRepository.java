package com.patrickproject.gestao_alunos.Repositories;

import com.patrickproject.gestao_alunos.entities.AlunoEntity;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Id> {
    void deleteById(Long id);
}
