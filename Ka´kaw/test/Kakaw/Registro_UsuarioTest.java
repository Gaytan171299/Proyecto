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
public class Registro_UsuarioTest {
    
    public Registro_UsuarioTest() {
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
     * Test of Ingresar_Usuario method, of class Registro_Usuario.
     */
    @Test
    public void testIngresar_Usuario() {
        System.out.println("Funciona");
        String clave = "";
        String nombreUs = "";
        String apellidoUs = "";
        String correoE = "";
        String numeroC = "";
        String direccion = "";
        String fechaN = "";
        Registro_Usuario instance = new Registro_Usuario();
        instance.Ingresar_Usuario(clave, nombreUs, apellidoUs, correoE, numeroC, direccion, fechaN);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of main method, of class Registro_Usuario.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registro_Usuario.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
