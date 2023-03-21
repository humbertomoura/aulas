package br.edu.ifrs.veranopolis.tads.aula04.repository;

import br.edu.ifrs.veranopolis.tads.aula04.entity.Tarefa;
import org.springframework.data.repository.CrudRepository;


public interface TarefaRepository extends CrudRepository<Tarefa, Integer> {

}


