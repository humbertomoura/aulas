package model;

public abstract class Produto {
    public String nome;
    public String codigoBarras;
    public String etiqueta;

    public void prepara(){
        System.out.println("Preparando " + nome);
        System.out.println("Adicionando código de barras..." + codigoBarras);
        System.out.println("Colocando etiqueta ..." + etiqueta);


    }
    public void separa(){
        System.out.println("Separando produto... " + nome);
    }
    public void embala(){
        System.out.println("Embalando produto... " + nome);
    }
    public void envia(){
        System.out.println("Enviando produto... " + nome);
    }

    public String getNome() {
        return nome;
    }
}
