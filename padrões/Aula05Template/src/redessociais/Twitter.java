package redessociais;


public class Twitter extends RedeSocial {

    public Twitter(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean login(String usuario, String senha) {
        System.out.println("\nVerifica parâmetros do usuário: ");
        System.out.println("Nome: " + this.usuario);
        System.out.print("Senha: ");
        for (int i = 0; i < this.senha.length(); i++) {
            System.out.print("*");
        }
        simulataLatenciaRede();
        System.out.println("\n\nLogin realizado no Twitter");
        return true;
    }

    public boolean enviaDados(byte[] dados) {
        boolean mensagemPostada = true;
        if (mensagemPostada) {
            System.out.println("Mensagem: '" + new String(dados) + "' foi postada no Twitter");
            return true;
        } else {
            return false;
        }
    }

    public void logout() {
        System.out.println("Usuário: '" + usuario + "' foi deslogado do Twitter");
    }

    private void simulataLatenciaRede() {
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
