import interfaces.TomadaAdapter;
import model.TomadaAdapterImplementation;
import model.Volt;
public class Principal {

	public static void main(String[] args) {
		// utilizando herança
		TomadaAdapter tomadaAdapter = new TomadaAdapterImplementation();
		
		// utilizando composição
		//TomadaAdapter tomadaAdapter = new TomadaObjectAdapterImplementation();
		
		Volt v3   = getVolt(tomadaAdapter, 3);
		Volt v12  = getVolt(tomadaAdapter, 12);
		Volt v120 = getVolt(tomadaAdapter, 120);

		System.out.println("V3 volts está usando  Adapter " + v3.getVolts());
		System.out.println("V12 volts está usando Adapter " + v12.getVolts());
		System.out.println("V120 volts está usandoa Adapter " + v120.getVolts());
	}
	
	private static Volt getVolt(TomadaAdapter tomadaAdapter, int i) {
		switch (i) {
			case 3:  return  tomadaAdapter.get3Volts();
			case 12: return  tomadaAdapter.get12Volts();
			case 120:return  tomadaAdapter.get120Volts();
			default: return  tomadaAdapter.get120Volts();
		}
	}
}

