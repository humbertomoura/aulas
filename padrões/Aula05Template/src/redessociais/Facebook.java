package redessociais;

public class Facebook extends RedeSocial {
    
	public Facebook(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean login(String useario, String senha) {
        System.out.println("\nVerificando os parâmetros do usuário");
        System.out.println("Nome: " + this.usuario);
        System.out.print("Senha: ");
        for (int i = 0; i < this.senha.length(); i++) {
            System.out.print("*");
        }
        simulaLatenciaRede();
        System.out.println("\n\nLogin no Facebook realizado com sucesso!");
        return true;
    }

    public boolean enviaDados(byte[] dados) {
        boolean mensagemPostada = true;
        if (mensagemPostada) {
            System.out.println("Mensagem: '" + new String(dados) + "' foi postada no Facebook");
            return true;
        } else {
            return false;
        }
    }

    public void logout() {
        System.out.println("Usuário: '" + usuario + "' foi deslogado do Facebook");
    }

    private void simulaLatenciaRede() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
