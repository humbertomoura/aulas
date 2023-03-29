package model;

import interfaces.Sorvete;
import interfaces.SorveteDecorator;

public class SorveteMenta extends SorveteDecorator {
    public SorveteMenta(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double custo() {
        System.out.println("Adicionando Sorvete de Menta!");
        return  1.50 + super.custo();
    }
}


