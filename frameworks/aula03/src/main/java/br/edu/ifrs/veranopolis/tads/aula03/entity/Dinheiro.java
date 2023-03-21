package br.edu.ifrs.veranopolis.tads.aula03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dinheiro extends Pagamento{
    @Id
    private int id;
    private boolean temTroco;
    private float troco;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public boolean isTemTroco() {
        return temTroco;
    }

    public void setTemTroco(boolean temTroco) {
        this.temTroco = temTroco;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }
}
