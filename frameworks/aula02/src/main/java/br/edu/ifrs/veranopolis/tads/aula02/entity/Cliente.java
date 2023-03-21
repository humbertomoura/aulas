package br.edu.ifrs.veranopolis.tads.aula02.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Cliente {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cpf;
    private String fone;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_endereco")
    private Endereco endereco;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public void setEmail(String email) {
        this.email = email;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente clienteBD = (Cliente) o;
        return id == clienteBD.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
