package br.edu.ifrs.veranopolis.tads.aula03;

import br.edu.ifrs.veranopolis.tads.aula03.entity.*;
import br.edu.ifrs.veranopolis.tads.aula03.repository.ClienteRepository;
import br.edu.ifrs.veranopolis.tads.aula03.repository.EnderecoRepository;
import br.edu.ifrs.veranopolis.tads.aula03.repository.PagamentoRepository;
import br.edu.ifrs.veranopolis.tads.aula03.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class PrincipalRunner implements CommandLineRunner {

    @Autowired
    ClienteRepository cr;
    @Autowired
    EnderecoRepository er;

    @Autowired
    PedidoRepository pr;

    @Autowired
    PagamentoRepository pgr;



    @Override
    public void run(String... args) throws Exception {
        System.out.println("Iniciando a aplicação...");

        Cliente c = new Cliente();
        c.setNome("João da Silva");
        c.setCpf("76543678926");
        c.setEmail("joao@gmail.com");
        c.setFone("(54) 999989796");

        Endereco e = new Endereco();
        e.setLogradouro("Rua Principal");
        e.setNumero(45);
        e.setComplemento("Ap. 12");
        e.setBairro("Centro");
        e.setCidade("Veranópolis");
        e.setUf("RS");
        e.setCep("90067-000");

        c.setEndereco(e);  // Um cliente possui um endereço

        Pedido p1 = new Pedido();
        p1.setNome("Lápis");
        p1.setPreco(4);



        Pedido p2 = new Pedido();
        p2.setNome("Borracha");
        p2.setPreco(2);

        List<Pedido> pedidos = new ArrayList<Pedido>();
        pedidos.add(p1);
        pedidos.add(p2);

        c.setPedidos(pedidos); // Um cliente possui muitos pedidos


        Pagamento pag1 = new PayPal();
        pag1.setValor(20);
        pag1.setData(new Date());
        ((PayPal) pag1).setEmail("eu@hotmail.com");


        Pagamento pag2 = new Dinheiro();
        pag2.setValor(30);
        pag2.setData(new Date());
        ((Dinheiro) pag2).setTemTroco(true);
        ((Dinheiro) pag2).setTroco(5);

        List<Pagamento> pagamentos = new ArrayList<Pagamento>();
        pagamentos.add(pag1);
        pagamentos.add(pag2);

        c.setPagamentos(pagamentos); // Um cliente possui muitos pagamentos


        cr.save(c); // salva endereço, pedidos e pagamentos em cascata







    }
}
