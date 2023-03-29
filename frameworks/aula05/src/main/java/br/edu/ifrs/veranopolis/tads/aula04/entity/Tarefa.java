package br.edu.ifrs.veranopolis.tads.aula04.entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int horasPlanejadas;
    private int percentualAndamento;
    private Date dataInicio;
    private Date dataFinalizacao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_tarefa")
    private List<Colaborador> colaboradores;

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

    public int getHorasPlanejadas() {
        return horasPlanejadas;
    }

    public void setHorasPlanejadas(int horasPlanejadas) {
        this.horasPlanejadas = horasPlanejadas;
    }

    public int getPercentualAndamento() {
        return percentualAndamento;
    }

    public void setPercentualAndamento(int percentualAndamento) {
        this.percentualAndamento = percentualAndamento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Date dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return id == tarefa.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
