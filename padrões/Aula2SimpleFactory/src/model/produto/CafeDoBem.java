package model.produto;

import model.Produto;

public class CafeDoBem extends Produto {

    public CafeDoBem() {
        nome = "Café do bem";
        codigoBarras = "9654289765490";
        etiqueta = "Café Solúvel em Pó Do Bem - 500g.";
    }

    @Override
    public void separa() {
        System.out.println("Separando o café no corredor B...");
    }
}
