package model;

import interfaces.Sorvete;

public class SorveteBasico implements Sorvete {

    public SorveteBasico() {
        System.out.println("Criando um sorvete básico!");
    }

    @Override
    public double custo() {
        return 0.50;
    }
}

