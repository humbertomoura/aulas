package interfaces;

import model.Volt;

public interface TomadaAdapter {

    Volt get120Volts();
    
    Volt get12Volts();
    
    Volt get3Volts();
    
    Volt get1Volt();
}


