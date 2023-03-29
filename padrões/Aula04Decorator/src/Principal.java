

import interfaces.Sorvete;
import model.SorveteBasico;
import model.SorveteMenta;
import model.SorveteBaunilha;

public class Principal {

    public static void main(String[] args) {

        Sorvete sorveteBasico = new SorveteBasico();
        System.out.println("Custo Sorvete Básico R$ " + sorveteBasico.custo());

        Sorvete baunilha = new SorveteBaunilha(sorveteBasico); 
        System.out.println("Adicionando Baunilha - R$ " + baunilha.custo());

        Sorvete menta = new SorveteMenta(baunilha);
        System.out.println("Adicionando Menta - R$ " + menta.custo());


    }
}
