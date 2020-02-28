package Electrodomesticos;

public class Lavadora extends Electrodomestico {
	
	private int carga;
	
	private final int CARGA = 5;
	
	public Lavadora() {
		super();
		
	}
	
	public Lavadora(int precioBase, float peso) {
		super(precioBase,peso);
		
	}
	
	public Lavadora(float precioBase, float peso, String color, char consumoEnergetico,int carga) {
        super(precioBase, peso,color,consumoEnergetico);
        this.carga = CARGA;
    }

	public int getCarga() {
		return carga;
	}
	
	@Override
	public float precioFinal(Electrodomestico y) {
		float precioFinal = super.precioFinal(y);
		if(carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}
}
