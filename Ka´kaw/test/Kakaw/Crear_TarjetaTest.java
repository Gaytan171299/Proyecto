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
public class Crear_TarjetaTest {
    
    public Crear_TarjetaTest() {
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
     * Test of Ingresar_Tarjeta method, of class Crear_Tarjeta.
     */
    @Test
    public void testIngresar_Tarjeta() {
        System.out.println("Ingresar_Tarjeta");
        String numeroTar = "";
        String numeroSeg = "";
        String nombreUs = "";
        String compañia = "";
        String correo = "";
        String banco = "";
        String fecha = "";
        String tipo = "";
        Crear_Tarjeta instance = new Crear_Tarjeta();
        instance.Ingresar_Tarjeta(numeroTar, numeroSeg, nombreUs, compañia, correo, banco, fecha, tipo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Crear_Tarjeta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Crear_Tarjeta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
