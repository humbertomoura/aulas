package model;

import interfaces.Sorvete;
import interfaces.SorveteDecorator;

public class SorveteChocolate extends SorveteDecorator {


    public SorveteChocolate(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double custo() {
        System.out.println("Adicionando Sorvete de Chocolate!");
        return 1.0 + super.custo();

    }


}


