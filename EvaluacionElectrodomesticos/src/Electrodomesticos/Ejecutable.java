package Electrodomesticos;
public class Ejecutable extends Electrodomestico {

	public static void main(String[] args) {
		
		Electrodomestico[] listElectrodomesticos = new Electrodomestico[10];
		
		listElectrodomesticos[0] = new Electrodomestico(PRECIO_BASE,30,"NEGRO",'A');
		listElectrodomesticos[1] = new Lavadora(PRECIO_BASE,15,"NARANJA",'M',10);
		listElectrodomesticos[2] = new Electrodomestico(PRECIO_BASE,40,"AZUL",'B');
		listElectrodomesticos[3] = new Televisor(PRECIO_BASE,(float) 40,"ROJO",'E',30,true);
		listElectrodomesticos[4] = new Lavadora(PRECIO_BASE,25,"CELESTE",'D',60);
		listElectrodomesticos[5] = new Lavadora(PRECIO_BASE,80,"BLANCO",'K',50);
		listElectrodomesticos[6] = new Televisor(PRECIO_BASE,(float) 34,"GRIS",'C',60,false);
		listElectrodomesticos[7] = new Lavadora(PRECIO_BASE,5,"NEGRO",'G',9);
		listElectrodomesticos[8] = new Televisor(PRECIO_BASE,(float) 25,"ROJO",'F',14,true);
		listElectrodomesticos[9] = new Lavadora(PRECIO_BASE,70,"AMARILLO",'Z',99);

		float precioTotal = 0;
		float precioTotalElectro = 0;
		float precioElectro = 0;
		float precioLavadora = 0;
		float precioTelevisor = 0;
		
		for (int i = 0; i < listElectrodomesticos.length; i ++) {
				precioTotalElectro += listElectrodomesticos[i].precioFinal(listElectrodomesticos[i]);
				if(listElectrodomesticos[i] instanceof Electrodomestico ) {
					precioElectro += listElectrodomesticos[i].precioFinal(listElectrodomesticos[i]);	
					
						if(listElectrodomesticos[i] instanceof Lavadora) {
							precioLavadora += listElectrodomesticos[i].precioFinal(listElectrodomesticos[i]);
							
								if(listElectrodomesticos[i] instanceof Televisor) {
									precioTelevisor += listElectrodomesticos[i].precioFinal(listElectrodomesticos[i]);
				}
		}	
				}
		}
		
		precioTotalElectro = precioElectro += precioLavadora += precioTelevisor;
		Utilidades.escribir("El precio de las Lavadoras sumadas es " + precioLavadora);
		Utilidades.escribir("El precio de los Televisores sumados es " + precioTelevisor);
		Utilidades.escribir("El precio de los Electrodomesticos sumados es " + precioElectro);
		Utilidades.escribir("El precio total de compra es de " + precioTotalElectro);
	}
	
}
