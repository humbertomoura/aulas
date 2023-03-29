import java.util.ArrayList;
import java.util.List;

public class ProxyBanco implements Banco {

	private BancoReal banco = new BancoReal();
	private static List<String> clientesBanidos;


	static {
		clientesBanidos =  new ArrayList<String>();
		clientesBanidos.add("joão");
		clientesBanidos.add("josé");
		clientesBanidos.add("claudia");
	}

	@Override
	public void sacar(String nome) throws Exception {

		if (clientesBanidos.contains(nome.toLowerCase())) {
			throw new Exception(nome + " Acesso negado!  Você não está autorizado!");
		}else {

			banco.sacar(nome);
		}
	}
}

