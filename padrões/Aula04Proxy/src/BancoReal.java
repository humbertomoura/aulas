public class BancoReal implements Banco {
   
	@Override
    public void sacar(String cliente) throws Exception {
        System.out.println(cliente + " está sacando do Caixa Eletrônico....");
    }
}

