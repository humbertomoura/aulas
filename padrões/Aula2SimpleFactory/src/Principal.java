import interfaces.SimpleProdutoFactory;
import model.Produto;


public class Principal {

	public static void main(String[] args) {
       
		SimpleProdutoFactory fabrica = new SimpleProdutoFactory();
				
        Produto p =  fabrica.createProduto("bola");
        p.prepara();
        p.embala();
        p.envia();       	      
        
        System.out.println("Pedido finalizado: " + p.getNome() + "\n" );
        System.out.println("Todos pedidos foram concluídos!");

	}

}


