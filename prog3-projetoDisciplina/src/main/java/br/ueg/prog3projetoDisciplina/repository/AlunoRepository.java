package br.ueg.prog3projetoDisciplina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ueg.prog3projetoDisciplina.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	Aluno getById(long id);

}
