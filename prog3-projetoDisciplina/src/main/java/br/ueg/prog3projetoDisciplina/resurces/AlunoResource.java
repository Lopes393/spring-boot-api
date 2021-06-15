package br.ueg.prog3projetoDisciplina.resurces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.ueg.prog3projetoDisciplina.models.Aluno;
import br.ueg.prog3projetoDisciplina.repository.AlunoRepository;

@RestController
@RequestMapping(value="/api")
public class AlunoResource {

	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping("/alunos")
	public List<Aluno> getAlunos()
	{
		return alunoRepository.findAll();
	}

	@GetMapping("/aluno/{id}")
	public Aluno getAlunoById(@PathVariable(value="id") long id){
		return alunoRepository.getById(id);
	}
	
	@PostMapping("/aluno")
	public Aluno storeAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@DeleteMapping("/aluno/{id}")
	public String deleteAlunoById(@PathVariable(value="id") long id) {
		alunoRepository.deleteById(id);
		return "Aluno n° " + id + " deletado com sucesso!";
	}
	
	@PutMapping("/aluno")
	public Aluno updateAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
}
