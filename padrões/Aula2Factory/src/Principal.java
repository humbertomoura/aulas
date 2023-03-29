import interfaces.Loja;
import model.Produto;
import model.loja.LojistaA;
import model.loja.LojistaB;

public class Principal {

	public static void main(String[] args) {
       
        Loja supermercadoCompreBem = new LojistaA();
        Loja merceariaCentro = new LojistaB();

        Produto produto = supermercadoCompreBem.pedeProduto("bola");
        System.out.println("Pedido finalizado: " + produto.getNome() + "\n" );


        produto = merceariaCentro.pedeProduto("queijo");
        System.out.println("Pedido finalizado: " + produto.getNome() + "\n");

        System.out.println("Todos pedidos foram concluídos!");

	}

}

