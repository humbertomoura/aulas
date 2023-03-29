import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import redessociais.Facebook;
import redessociais.RedeSocial;
import redessociais.Twitter;

public class Principal {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		RedeSocial rede = null;
		
		System.out.print("Usuário: ");
		String usuario = reader.readLine();
		System.out.print("Senha: ");
		String senha = reader.readLine();


		System.out.print("Mensagem: ");
		String mensagem = reader.readLine();

		System.out.println("\nEscolha a rede social para postar a mensagem.\n" +
				"1 - Facebook\n" +
				"2 - Twitter");
		int escolha = Integer.parseInt(reader.readLine());


		if (escolha == 1) {
			rede = new Facebook(usuario, senha);
		} else if (escolha == 2) {
			rede = new Twitter(usuario, senha);
		}
		rede.post(mensagem);
	}

}
