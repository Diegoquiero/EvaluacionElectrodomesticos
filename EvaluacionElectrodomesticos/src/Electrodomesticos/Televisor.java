package Electrodomesticos;

public class Televisor extends Electrodomestico {
        
    /**
     * @param pulgadas
     * @param sintonizadorTDT
     */
	private int pulgadas;
	private boolean sintonizadorTDT;
	
	/**
	 * Constantes asignadas a los atributos pulgadas y sintonizadorTDT.
	 */
	private final int PULGADAS = 20;
	private final boolean SINTONIZADORTDT = false;
	
	/**
	 * Constructor por defecto.
	 */
	
	public Televisor() {
	    super();
	    this.pulgadas = PULGADAS;
	    this.sintonizadorTDT = SINTONIZADORTDT;
	}
	
	/**
	 * Constructor con dos atributos heredados de la clase Electrodomestico.
	 * @param precioBase
	 * @param peso
	 */
	public Televisor(float precioBase, float peso) {
		super(precioBase,peso);	
		this.pulgadas = PULGADAS;
		this.sintonizadorTDT = SINTONIZADORTDT;
		
	}
	
	/**
         * Constructor con atributos heredados de la clase Electrodomestico.
         * @param precioBase
         * @param peso
         * @param color
         * @param consumoEnergetico
         * @param pulgadas
         * @param sintonizadorTDT
         */
	public Televisor(float precioBase,Float peso,String color, char consumoEnergetico,
			int pulgadas, boolean sintonizadorTDT) {
		super(precioBase,peso,color,consumoEnergetico);
		this.pulgadas = pulgadas;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
         * Adiciona valores en base a la carga del objeto.
         * Metodo heredado de Super Clase Electrodomestico.
         */
	@Override
	public float precioFinal() {
		float precioFinal = super.precioFinal();
		
		
		if(this.getPulgadas()> 40) {
			precioFinal *= 1.30;
		}
		if (this.sintonizadorTDT) {
			precioFinal += 50;
			
		}
		return precioFinal;
	}
}
