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
public class PagosTest {
    
    public PagosTest() {
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
     * Test of llenarMapa method, of class Pagos.
     */
    @Test
    public void testLlenarMapa() {
        System.out.println("llenarMapa");
        Pagos instance = new Pagos();
        instance.llenarMapa();

    }

    /**
     * Test of llenarTabla method, of class Pagos.
     */
    @Test
    public void testLlenarTabla() {
        System.out.println("llenarTabla");
        Pagos.llenarTabla();

    }

    /**
     * Test of Ingresar_Pago method, of class Pagos.
     */
    @Test
    public void testIngresar_Pago() {
        System.out.println("Ingresar_Pago");
        int idTrans = 0;
        String correoE = "";
        int tar = 0;
        Pagos instance = new Pagos();
        instance.Ingresar_Pago(idTrans, correoE, tar);
    }    }


