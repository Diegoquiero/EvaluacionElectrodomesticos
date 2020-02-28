package Electrodomesticos;

public class Televisor extends Electrodomestico {

	private float pulgadas;
	private boolean sintonizadorTDT;
	
	private final float PULGADAS = 20;
	private final boolean SINTONIZADORTDT = false;
	
	public Televisor() {
	}
	
	public Televisor(float precioBase, float peso) {
		super(precioBase,peso);
		
	}
	
	public Televisor(float precioBase,Float peso,String color, char consumoEnergetico,
			float pulgadas, boolean SINTONIZADORTDT) {
		super(precioBase,peso,color,consumoEnergetico);
		this.pulgadas = PULGADAS;
		this.sintonizadorTDT = SINTONIZADORTDT;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	@Override
	public float precioFinal(Electrodomestico y) {
		float precioFinal = super.precioFinal(y);
		if(pulgadas> 40) {
			precioFinal = (float) (PRECIO_BASE * 1.30);
		}
		if (sintonizadorTDT = true) {
			precioFinal += 50;
			
		}
		return precioFinal;
		}
	}
