package Electrodomesticos;



public class Ejecutable  {

    
    public static void main(String[] args) {
        /** 
         * Constante de precioBase.
         */
        final float PRECIO_BASE = 100000;
        
        /**
         * Creo un array que almacena 10 objetos de tipo Electrodomestico,
         * el cual, llenamos con articulos de la super clase y sus dos clases hijas.
         */
        Electrodomestico[] listElectrodomesticos = new Electrodomestico[10];

        listElectrodomesticos[0] = new Electrodomestico(PRECIO_BASE, 30, "NEGRO", 'A');
        listElectrodomesticos[1] = new Lavadora(PRECIO_BASE, 15, "NARANJA", 'M', 10);
        listElectrodomesticos[2] = new Electrodomestico(PRECIO_BASE, 40, "AZUL", 'B');
        listElectrodomesticos[3] = new Televisor(PRECIO_BASE, 40f, "ROJO", 'E', 30, true);
        listElectrodomesticos[4] = new Lavadora(PRECIO_BASE, 25, "CELESTE", 'D', 60);
        listElectrodomesticos[5] = new Lavadora(PRECIO_BASE, 80, "BLANCO", 'K', 50);
        listElectrodomesticos[6] = new Televisor(PRECIO_BASE,34f, "GRIS", 'C', 60, false);
        listElectrodomesticos[7] = new Lavadora(PRECIO_BASE, 5, "NEGRO", 'G', 9);
        listElectrodomesticos[8] = new Televisor(PRECIO_BASE, 25f, "ROJO", 'F', 14, true);
        listElectrodomesticos[9] = new Lavadora(PRECIO_BASE, 70, "AMARILLO", 'Z', 99);

        
        /**
         * definimos parametros que almacenaran los valores totales de los objetos por clase.
         */
        
        float precioElectro = 0;
        float precioLavadora = 0;
        float precioTelevisor = 0;

        /**
         * Recorre el arreglo en su totalidad.
         * Aplica el metodo de la super clase precioFinal
         * Diferenciado por clase.
         */
        for (int i = 0; i < listElectrodomesticos.length; i++) {
            if (listElectrodomesticos[i] instanceof Electrodomestico) {
                precioElectro += listElectrodomesticos[i].precioFinal();
            }
        }
        for (int i = 0; i < listElectrodomesticos.length; i++) {
            if (listElectrodomesticos[i] instanceof Lavadora) {
                System.out.println("Valor Lavadora "+listElectrodomesticos[i].precioFinal());;
                precioLavadora+=listElectrodomesticos[i].precioFinal();
            }
        }
        
        for (int i = 0; i < listElectrodomesticos.length; i++) {
            if (listElectrodomesticos[i] instanceof Televisor) {
                System.out.println("precio Televisor " + +listElectrodomesticos[i].precioFinal());;
                precioTelevisor+=listElectrodomesticos[i].precioFinal();
            }
        }
        
        /**
         * Imprime los valores almacenadas en las variables.
         * @param precioLavadora
         * @param precioTelevisores
         * @param precioElectro
         */
        Utilidades.escribir("El precio de las Lavadoras sumadas es " + precioLavadora);
        Utilidades.escribir("El precio de los Televisores sumados es " + precioTelevisor);
        Utilidades.escribir("El precio de los Electrodomesticos sumados es " + precioElectro);
     
    }

}
