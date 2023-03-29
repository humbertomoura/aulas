public class Principal {

	public static void main(String[] args) {
		
		Banco banco = new ProxyBanco();

		try {			
			banco.sacar("Maria");
			banco.sacar("João");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}



