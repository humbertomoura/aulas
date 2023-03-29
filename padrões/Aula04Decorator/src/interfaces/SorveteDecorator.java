package interfaces;

public class SorveteDecorator implements Sorvete {

    private Sorvete iceCream;

    public SorveteDecorator(Sorvete sorvete) {
        this.iceCream = sorvete;
    }

    @Override
    public double custo() {
        return this.iceCream.custo();
    }
}


