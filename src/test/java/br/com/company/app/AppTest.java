/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.app;

import br.com.company.model.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Avell B154 PLUS
 */
public class AppTest {
    
    public AppTest() {
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
     * Test of main method, of class App.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("This is an excpected error.");
    }

    /**
     * Test of printIMCOnConsole method, of class App.
     */
    @Test
    public void testPrintIMCOnConsole() {
        System.out.println("printIMCOnConsole");
        Person p = null;
        App instance = new App();
        try{
            instance.printIMCOnConsole(p);
        }catch(Exception e){
            throw e;
        }
        assertNotNull(p);
    }
    /**
     * Test of testPrintIMCOnConsoleWithouError method, of class App.
     */
    @Test
    public void testPrintIMCOnConsoleWithouError() {
        System.out.println("testPrintIMCOnConsoleWithouError");
        Person p = new Person("Juliano Rodrigo", "Lamb", 'm', 1.81, 82.1);
        App instance = new App();
        instance.printIMCOnConsole(p);
        assertNotNull(p);
    }
    
}
