package interfaces;

import model.Produto;
import model.produto.BolaFutebol;
import model.produto.CafeDoBem;
import model.produto.ManteigaAmizade;
import model.produto.QueijoLanche;

public class SimpleProdutoFactory {
    
	public Produto createProduto(String tipo){
    
		Produto produto = null;
       
        if (tipo.equals("bola")) {
            produto = new BolaFutebol();
        }else if (tipo.equals("queijo")) {
            produto = new QueijoLanche();
        }else if (tipo.equals("cafe")) {
            produto = new CafeDoBem();
        }else if (tipo.equals("manteiga")) {
            produto = new ManteigaAmizade();
        }

        return produto; 
    }
    
}
