/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package examen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dammdcd1
 */
public class CocheTest {
    
    public CocheTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Test of precioConIva method, of class Coche.
     */
    @Test
    public void testPrecioConIva() {
        System.out.println("precioConIva");
        boolean ivareducido = true;
        Coche instance = new Coche("Ford", "Focus", 5000, 0);
        double expResult = 5500;
        double result = instance.precioConIva(ivareducido);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testPrecioConIva2() {
        System.out.println("precioConIva");
        boolean ivareducido = false;
        Coche instance = new Coche("Audi", "A3", 34000, 0);
        double expResult = 41400;
        double result = instance.precioConIva(ivareducido);
        assertEquals(expResult, result);
        
    }

       
}
