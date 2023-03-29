package model;

import interfaces.Sorvete;
import interfaces.SorveteDecorator;

public class SorveteBaunilha extends SorveteDecorator{
    public SorveteBaunilha(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double custo() {
        System.out.println("Adicionando Sorvete de Baunilha!");
        return 1.0 + super.custo();
    }
}


