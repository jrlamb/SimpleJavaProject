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
    
    private static App instance;
    private static Person person;
    
    public AppTest() {
        System.out.println("Called a AppTest");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass called : " + System.currentTimeMillis());
        instance = new App();
        person = new Person();
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass called : " + System.currentTimeMillis());
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp called : " + System.currentTimeMillis());
        person.setFirstName("Testing firsname");
        person.setLastName("Testing lastname");
        person.setGender('m');
        person.setHeight(1.75);
        person.setWeight(77.0);
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown called : " + System.currentTimeMillis());
    }

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() {
        System.out.println("testMain called : " + System.currentTimeMillis());
        String[] args = null;
        App.main(args);
        System.out.println("testMain end : " + System.currentTimeMillis());
        // TODO review the generated test code and remove the default call to fail.        
        //fail("Failed at testMain.");
    }

    /**
     * Test of calculateIMC method, of class App.
     */
    @Test
    public void testCalculateIMCSuccess() {
        System.out.println("calculateIMC called : " + System.currentTimeMillis());
        double expResult = 25.142857142857142;
        double result = instance.calculateIMC(person);
        assertEquals(expResult, result, 0.0);
        
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(result);
    }
    /**
     * Test of calculateIMC method, of class App.
     */
    @Test
    public void testCalculateIMCError() {
        System.out.println("calculateIMC called : " + System.currentTimeMillis());
        double expResult = 0.0;
        double result = instance.calculateIMC(person);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("MyTest Jenkins email");
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed at testCalculateIMCSuccess.");
    }
    
}
