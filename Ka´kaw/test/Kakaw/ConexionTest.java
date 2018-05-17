/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kakaw;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class ConexionTest {
    
    public ConexionTest() {
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
     * Test of getInstancia method, of class Conexion.
     */
    @Test
    public void testGetInstancia() {
        System.out.println("Se Obtuvo Instancia");
        Conexion expResult = null;
        Conexion result = Conexion.getInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of hacerConsulta method, of class Conexion.
     */
    @Test
    public void testHacerConsulta() {
        System.out.println("hacerConsulta");
        String consulta = "";
        Conexion instance = new Conexion();
        ResultSet expResult = null;
        ResultSet result = instance.hacerConsulta(consulta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of ejecutarSentencia method, of class Conexion.
     */
    @Test
    public void testEjecutarSentencia() {
        System.out.println("ejecutarSentencia");
        String consulta = "";
        Conexion instance = new Conexion();
        instance.ejecutarSentencia(consulta);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getConexion method, of class Conexion.
     */
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        Conexion instance = new Conexion();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getSentencia method, of class Conexion.
     */
    @Test
    public void testGetSentencia() {
        System.out.println("getSentencia");
        Conexion instance = new Conexion();
        Statement expResult = null;
        Statement result = instance.getSentencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
