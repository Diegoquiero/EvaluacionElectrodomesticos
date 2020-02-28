package Electrodomesticos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElectrodomesticoTest extends Electrodomestico{

	@BeforeAll
	static void setup() throws Exception {
		int precioBase;
		String color;
		char consumoEnergetico;
		float peso;
		precioBase = PRECIO_BASE;
		color = COLOR;
		consumoEnergetico = 'F';
		peso = PESO;
	}

	@Test
	public void muestraPrecio() {
		System.out.println(getPrecioBase());
	}
	
	@Test
	public void muestraColor() {
		System.out.println(getColor());
	}
	
	@Test
	public void muestraConsumoEnergetico() {
		System.out.println(getConsumoEnergetico());
	}
	
	@Test
	public void muestraPeso() {
		System.out.println(getPeso());
	}
	
	@Test
	public void muestraConsumo() {
		char letra = 'j';
		comprobarConsumoEnergetico(letra);
		
		assertEquals(comprobarConsumoEnergetico(letra),getConsumoEnergetico());
		}
	@Test
	public boolean muestra
	}
