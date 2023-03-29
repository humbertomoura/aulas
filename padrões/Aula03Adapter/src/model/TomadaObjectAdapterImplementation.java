package model;
import interfaces.TomadaAdapter;
// utilizando composição
public class TomadaObjectAdapterImplementation implements TomadaAdapter {

   
    private Tomada tomada = new Tomada();

    @Override
    public Volt get120Volts() {
        return tomada.getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = tomada.getVolt();
        return converteVolt(v, 10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = tomada.getVolt();
        return converteVolt(v, 40);
    }

    @Override
    public Volt get1Volt() {
        return null;
    }

    private Volt converteVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
