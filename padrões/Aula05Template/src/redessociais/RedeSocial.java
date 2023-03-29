package redessociais;


public abstract class RedeSocial {
	String usuario;
	String senha;


	// Publica os dados em qualquer rede social.

	public boolean post(String mensagem) {
		// Autentica antes de postar. 
		// Cada rede autentica de forma diferente
		if (login(this.usuario, this.senha)) {

			boolean result =  enviaDados(mensagem.getBytes());
			logout();
			return result;
		}
		return false;
	}

	abstract boolean login(String usuario, String senha);
	abstract boolean enviaDados(byte[] dados);
	abstract void logout();
}