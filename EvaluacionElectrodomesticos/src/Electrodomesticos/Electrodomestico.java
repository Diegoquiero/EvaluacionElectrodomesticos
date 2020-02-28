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

    private float precioBase;
    private String color;
    private char consumoEnergetico;
    private float peso;
    /**
     * Valores por defecto que poseeran los articulos.
     */
    protected final static float PRECIO_BASE = 100000;
    protected final static String COLOR = "BLANCO";
    protected final static char CONSUMO_ENERGETICO = 'F';
    protected final static float PESO = 5;

    /**
     * Constructor por defecto.
     */
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = PESO;
    }

    /**
     * Constructor incluye precio base y peso.
     * 
     * @param precioBase se le asigna el valor por defecto registrado en la
     *                   constante.
     * @param peso       se le asigna el valor por defecto registrado en la
     *                   constante.
     */
    public Electrodomestico(float precioBase, float peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;

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
    public Electrodomestico(float precioBase, float peso, String color, char consumoEnergetico) {
        this(precioBase, peso);
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPrecioBase() {
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

    /**
     * Verifica que la letra ingresada por consumo sea valida. si no asigna valor
     * por defecto.
     */

    public char comprobarConsumoEnergetico(char letra) {
        for (int i = 0; i < Utilidades.LETRAS.length; i++) {
            if (letra != Utilidades.LETRAS[i]) {
                letra = CONSUMO_ENERGETICO;
            }

        }
        return letra;
    }

    /**
     * Verifica que el color ingresado para color del articulo sea valido. si no
     * asigna color por defecto.
     */
    public String comprobarColor(String color) {
        for (int i = 0; i < Utilidades.COLOR.length; i++) {
            if (color != Utilidades.COLOR[i]) {
                color = COLOR;
            }

        }
        return color;
    }

    /**
     * Suma los valores de los metodos que entregan valor del Electrodomestico en
     * base a consumoEnergetico y Peso.
     * 
     * @return contador.
     */
    public float precioFinal() {
        float contador = this.precioBase;
        contador += precioConsumo();
        contador += porPeso();

        return contador;
    }

    /**
     * \ Genera valor en base a consumoEnergetico.
     * 
     * @return valor contador
     */
    public float precioConsumo() {
        float contador = 0;

        if (this.consumoEnergetico == 'A') {
            contador += 100;
            if (this.consumoEnergetico == 'B') {
                contador += 80;
            } else {
                if (this.consumoEnergetico == 'C') {
                    contador += 60;
                } else {
                    if (this.consumoEnergetico == 'D') {
                        contador += 50;
                    } else {
                        if (this.consumoEnergetico == 'E') {
                            contador += 30;
                        } else {
                            if (this.consumoEnergetico == 'F') {
                                contador += 10;
                            } else {
                                contador = 0;
                            }
                        }
                    }
                }
            }
        }
        return contador;
    }

    /**
     * Genera valor en base a peso.
     * 
     * @return contadorPeso.
     */
    public float porPeso() {
        float contadorPeso = 0;
        if (this.peso == 0 && this.peso <= 19) {
            contadorPeso += 10;
        } else {
            if (this.peso == 20 && this.peso <= 49) {
                contadorPeso = +50;
            } else {
                if (this.peso == 50 && this.peso <= 79) {
                    contadorPeso += 80;
                } else {
                    if (this.peso > 80) {
                        contadorPeso += 100;
                    } else {
                        contadorPeso = 0;
                    }

                }

            }

        }
        return contadorPeso;
    }

}
