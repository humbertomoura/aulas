package br.edu.ifrs.veranopolis.tads.aula04.repository;

import br.edu.ifrs.veranopolis.tads.aula04.entity.Colaborador;
import br.edu.ifrs.veranopolis.tads.aula04.entity.Tarefa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ColaboradorRepository extends CrudRepository<Colaborador, Integer> {

    @Query("SELECT c.nome FROM Colaborador c WHERE c.id=:id")
    public String findNomeById(@Param("id") int id);


    @Query("SELECT c FROM Colaborador c WHERE c.nome=:nome")
    public Colaborador findByNome(@Param("nome") String nome);


    // SELECT c.*,t.nome  FROM
    //colaborador c JOIN tarefa_colaboradores tc ON c.id = tc.colaboradores_id
    //JOIN
    //tarefa t on tc.tarefas_id = t.id
    //where t.nome = "Cortar Grama";
    @Query("SELECT c FROM Colaborador c JOIN c.tarefas t WHERE t.nome=:tarefa")
    public Iterable<Colaborador> findByTarefa(@Param("tarefa") String tarefa);

    @Query("SELECT c FROM Colaborador c JOIN c.materiais m WHERE m.nome=:material")
    public Iterable<Colaborador> findByMaterial(@Param("material") String material);

}


