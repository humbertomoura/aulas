package br.edu.ifrs.veranopolis.tads.aula03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class PayPal extends Pagamento{
    @Id
    private int id;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PayPal payPal)) return false;
        return id == payPal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
