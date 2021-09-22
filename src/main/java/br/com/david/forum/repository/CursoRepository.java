package br.com.david.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.david.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
