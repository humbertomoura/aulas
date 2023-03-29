package model.loja;

import interfaces.Loja;
import model.Produto;
import model.produto.CafeDoBem;
import model.produto.ManteigaAmizade;

public class LojistaB extends Loja {
    @Override
    public Produto createProduto(String tipo) {

        if (tipo.equals("queijo")) {
            return new CafeDoBem();
        }else if (tipo.equals("manteiga")) {
            return new ManteigaAmizade();

        }else  return null;
    }
}


