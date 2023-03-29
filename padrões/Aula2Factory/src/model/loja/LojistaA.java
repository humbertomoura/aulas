package model.loja;

import interfaces.Loja;
import model.Produto;
import model.produto.BolaFutebol;
import model.produto.QueijoLanche;

public class LojistaA extends Loja {
    @Override
    public Produto createProduto(String tipo) {

        if (tipo.equals("bola")) {
            return new BolaFutebol();
        }else if (tipo.equals("queijo")) {
            return new QueijoLanche();

        }else  return null;

    }
}


