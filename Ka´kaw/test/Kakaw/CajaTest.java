package Kakaw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Kakaw.caja;
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
public class CajaTest {
    
    public CajaTest() {
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
     * Test of Ingresar_Transaccion method, of class caja.
     */
    @Test
    public void testIngresar_Transaccion() {
        System.out.println("Ingresar_Transaccion");
        int idTrans = 0;
        double mont = 0.0;
        int empre = 0;
        caja instance = new caja();
        instance.Ingresar_Transaccion(idTrans, mont, empre);
  
    }

    /**
     * Test of main method, of class caja.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        caja.main(args);

    }
    
}
