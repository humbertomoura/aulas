package br.edu.ifrs.veranopolis.tads.aula04.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String especialidade;
    private String fone;
    private String email;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "colaboradores", fetch = FetchType.EAGER)
    private List<Tarefa> tarefas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colaborador", fetch = FetchType.EAGER)
    private List<Material> materiais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        especialidade = especialidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Colaborador that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

