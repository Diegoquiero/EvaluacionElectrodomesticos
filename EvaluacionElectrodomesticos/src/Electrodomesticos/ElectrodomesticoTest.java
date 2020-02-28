package Electrodomesticos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElectrodomesticoTest {

    Electrodomestico elec;
    @BeforeEach
    
    void setUp() throws Exception {
        elec = new Electrodomestico();   
        }

    @Test
    void testGetPrecioBase() {
        assertEquals(100000, elec.getPrecioBase());
    }

    @Test
    void testGetColor() {
        assertEquals("BLANCO", elec.getColor());
    }

    @Test
    void testGetConsumoEnergetico() {
        assertEquals('F', elec.getConsumoEnergetico());
    }

    @Test
    void testGetPeso() {
        assertEquals(5, elec.getPeso());
    }

    @Test
    void testComprobarConsumoEnergetico() {
        char c = 'A';
        assertEquals(c, elec.comprobarConsumoEnergetico(c));
        
        c='M';
        assertEquals('F', elec.comprobarConsumoEnergetico(c));
    }

    @Test
    void testComprobarColor() {
        String col = "AZUL";
        assertEquals(col, elec.comprobarColor(col));
        
        col = "VERDE";
        assertEquals("BLANCO", elec.comprobarColor(col));
    }

    @Test
    void testPrecioFinal() {
        fail("No implementado aun");
    }

    @Test
    void testPrecioConsumo() {
        fail("No implementado aun");
    }

    @Test
    void testPorPeso() {
        fail("No implementado aun");
    }

}
