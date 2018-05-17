/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kakaw;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josec
 */
public class TarjetaTest {
    
    public TarjetaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTarjeta method, of class Tarjeta.
     */
    @Test
    public void testGetTarjeta() {
        System.out.println("getTarjeta");
        Tarjeta instance = new Tarjeta();
        String expResult = "";
        String result = instance.getTarjeta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of getCompañia method, of class Tarjeta.
     */
    @Test
    public void testGetCompañia() {
        System.out.println("getCompa\u00f1ia");
        Tarjeta instance = new Tarjeta();
        String expResult = "";
        String result = instance.getCompañia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getBanco method, of class Tarjeta.
     */
    @Test
    public void testGetBanco() {
        System.out.println("getBanco");
        Tarjeta instance = new Tarjeta();
        String expResult = "";
        String result = instance.getBanco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getTipo method, of class Tarjeta.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Tarjeta instance = new Tarjeta();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setTarjeta method, of class Tarjeta.
     */
    @Test
    public void testSetTarjeta() {
        System.out.println("setTarjeta");
        String tarjeta = "";
        Tarjeta instance = new Tarjeta();
        instance.setTarjeta(tarjeta);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of setCompañia method, of class Tarjeta.
     */
    @Test
    public void testSetCompañia() {
        System.out.println("setCompa\u00f1ia");
        String compañia = "";
        Tarjeta instance = new Tarjeta();
        instance.setCompañia(compañia);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of setBanco method, of class Tarjeta.
     */
    @Test
    public void testSetBanco() {
        System.out.println("setBanco");
        String banco = "";
        Tarjeta instance = new Tarjeta();
        instance.setBanco(banco);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of setTipo method, of class Tarjeta.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Tarjeta instance = new Tarjeta();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
