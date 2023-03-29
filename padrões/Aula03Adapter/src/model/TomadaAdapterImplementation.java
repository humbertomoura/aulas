package model;

import interfaces.TomadaAdapter;

//  Adapter
public class TomadaAdapterImplementation extends Tomada implements TomadaAdapter {
  
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = getVolt();
        return converteVolt(v, 10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = getVolt();
        return converteVolt(v, 40);
    }

    @Override
    public Volt get1Volt() {
        return get1Volt();
    }

    private Volt converteVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}


