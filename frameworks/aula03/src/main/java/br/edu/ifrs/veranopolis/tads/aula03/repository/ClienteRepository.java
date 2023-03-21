package br.edu.ifrs.veranopolis.tads.aula03.repository;

import br.edu.ifrs.veranopolis.tads.aula03.entity.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}


