package br.edu.ifrs.veranopolis.tads.aula02.repository;

import br.edu.ifrs.veranopolis.tads.aula02.entity.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}


