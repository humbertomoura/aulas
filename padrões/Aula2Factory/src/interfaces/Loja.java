package interfaces;

import model.Produto;

public abstract class Loja {


    public Produto pedeProduto(String tipo){
        Produto produto;

        // Usando o factory! Não utilizamos os IFs.
        produto =  createProduto(tipo); 

        produto.prepara();
        produto.separa();
        produto.embala();
        produto.envia();

        return produto;

    }

    abstract public Produto createProduto(String type);
}

