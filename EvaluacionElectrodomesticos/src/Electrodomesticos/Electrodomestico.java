package Electrodomesticos;

import Electrodomesticos.Utilidades;

public class Electrodomestico {

    /**
     * @param precioBase        corresponde al precio que tendran los objetos hijos.
     * @param color             corresponde al color que tendran los objetos hijos.
     * @param consumoEnergetico corresponde al consumoEnergetico que tendran los
     *                          objetos hijos.
     * @param peso              corresponde al peso que tendran los objetos hijos.
     */
  
    private int precioBase;
    private String color;
    private char consumoEnergetico;
    private float peso;
    /**
     * Valores por defecto que poseeran los articulos.
     */
    protected final int PRECIO_BASE = 100000;
    protected final String COLOR = "BLANCO";
    protected final char CONSUMO_ENERGETICO = 'F';
    protected final float PESO = 5;

    /**
     * Constructor por defecto.
     */
    public Electrodomestico() {
        this.precioBase = 0;
        this.color = "";
        this.consumoEnergetico = 'F';
        this.peso = 0;
    }

    /**
     * Constructor incluye precio base y peso.
     * 
     * @param precioBase se le asigna el valor por defecto registrado en la
     *                   constante.
     * @param peso       se le asigna el valor por defecto registrado en la
     *                   constante.
     */
    public Electrodomestico(int precioBase, float peso) {
        this();
        this.precioBase = PRECIO_BASE;
        this.peso = PESO;

    }

    /**
     * Constructor con todos lo atributos de la clase.
     * 
     * @param precioBase        se llama desde el constructor anterior.
     * @param peso              se llama desde el constructor anterior.
     * @param color             se le asigna el valor por defecto registrado en la
     *                          constante.
     * @param consumoEnergetico se le asigna el valor por defecto registrado en la
     *                          constante.
     */
    public Electrodomestico(int precioBase, float peso, String color, char consumoEnergetico) {
        this(precioBase, peso);
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        for (int i = 0; i < Utilidades.LETRAS.length; i++) {
            if (letra != Utilidades.LETRAS[i]) {
                letra = CONSUMO_ENERGETICO;
            }
            return letra;
        }

    }

    public String comprobarColor(String color) {
        for (int i = 0; i < Utilidades.COLOR.length; i++) {
            if (color != Utilidades.COLOR[i]) {
                color = COLOR;
            }
            return color;
        }

    }

    public float precioFinal(char consumoEnergetico, int peso) {
        float contadorFinal = 0;
        float contador = PRECIO_BASE;
        float contadorPeso = 0;
        if (consumoEnergetico == 'A') {
            contador += 100;
            if (consumoEnergetico == 'B') {
                contador += 80;
                if (consumoEnergetico == 'C') {
                    contador += 60;
                    if (consumoEnergetico == 'D') {
                        contador += 50;
                        if (consumoEnergetico == 'E') {
                            contador += 30;
                            if (consumoEnergetico == 'F') {
                                contador += 10;
                            } else {
                                contador = PRECIO_BASE;
                            }
                        
                        }
                 }

                    }
                }
            }
        
        if (peso == 0 && peso <= 19) {
            contadorPeso += 10;
            if (peso == 20 && peso <= 49) {
                contadorPeso = +50;
                if (peso == 50 && peso <= 79) {
                    contadorPeso += 80;
                    if (peso > 80) {
                        contadorPeso += 100;
                    

            }
        }

    }
        
 }
        
  contadorFinal = contador + contadorPeso;       
        
        
        
    }
    }
}
