package Electrodomesticos;

public class Lavadora extends Electrodomestico {
	
        /**
         * @param carga corresponde a carga del articulo.
         */
	private int carga;
	/**
	 * Constante que se asignara a carga.
	 */
	private final int CARGA = 5;
	
	/**
	 * Constructor por defecto.
	 */
	public Lavadora() {
		super();
		this.carga = CARGA;
		
	}
	/**
	 * Constructor con dos atributos heredados de la clase Electrodomestico.
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(int precioBase, float peso) {
		super(precioBase,peso);
		
	}
	
	/**
	 * Constructor con atributos heredados de la clase Electrodomestico.
	 * @param precioBase
	 * @param peso
	 * @param color
	 * @param consumoEnergetico
	 * @param carga
	 */
	public Lavadora(float precioBase, float peso, String color, char consumoEnergetico,int carga) {
        super(precioBase, peso,color,consumoEnergetico);
        this.carga = carga;
    }

	public int getCarga() {
		return carga;
	}
	
	/**
	 * Adiciona valores en base a la carga del objeto.
	 * Metodo heredado de Super Clase Electrodomestico
	 */
	@Override
	public float precioFinal() {
		float precioFinal = super.precioFinal();
		if(this.carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}
}
