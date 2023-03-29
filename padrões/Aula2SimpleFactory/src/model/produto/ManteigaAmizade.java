package model.produto;

import model.Produto;

public class ManteigaAmizade extends Produto {

    public ManteigaAmizade() {
        nome = "Manteiga Amizade";
        codigoBarras = "6754378920964";
        etiqueta = "Manteiga Amizade - Pote 200g.";
    }

    @Override
    public void separa() {
        System.out.println("Pegando a manteiga no freezer");
    }
}


