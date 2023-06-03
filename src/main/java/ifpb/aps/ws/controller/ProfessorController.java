package ifpb.aps.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ifpb.aps.ws.model.Professor;
import ifpb.aps.ws.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping
	public List<Professor> listarProfessores() {
		return professorService.listarProfessores();
	}
	
	@PostMapping
	public Professor cadastrarProfessor(@RequestBody Professor professor) {
		return professorService.cadastrarProfessor(professor);
	}
	
	@PutMapping
	public Professor atualizarProfessor(@RequestBody Professor professor) {
		return professorService.atualizarProfessor(professor);
	}
	
	@DeleteMapping
	public Long deletarProfessor(@RequestBody Professor professor) {
		return professorService.deletarProfessor(professor);
	}
}
