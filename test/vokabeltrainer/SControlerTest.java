/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author Friedrich
 */
public class SControlerTest {
    
    SControler instance;
    public SControlerTest() {
        instance = new SControler();
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
     * Test of erstelleVokabel method, of class SControler.
     */
    @Test
    public void testErstelleVokabel() {
        System.out.println("erstelleVokabel");
        String nName = "ire";
        String nZusatsangaben = "eo; ii; itum";
        String nBedeutung = "gehen";
        boolean vokabelkasten = true;
        boolean heufig = true;
        instance.erstelleVokabel(nName, nZusatsangaben, nBedeutung, vokabelkasten, heufig);        
    }

    /**
     * Test of geKont method, of class SControler.
     */
    @Test
    public void testGeKont() {
        System.out.println("geKont");
        Vokabel v = null;
        int expResult = 0;
        int result = instance.geKont(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loescheVokabelkasten method, of class SControler.
     */
    @Test
    public void testLoescheVokabelkasten() {
        System.out.println("loescheVokabelkasten");
        instance.loescheVokabelkasten();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zeichneBedeutung method, of class SControler.
     */
    @Test
    public void testZeichneBedeutung() {
        System.out.println("zeichneBedeutung");
        Vokabel v = null;
        int expResult = 0;
        int result = instance.zeichneBedeutung(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zeichneZusatzangaben method, of class SControler.
     */
    @Test
    public void testZeichneZusatzangaben() {
        System.out.println("zeichneZusatzangaben");
        Vokabel v = null;
        int expResult = 0;
        int result = instance.zeichneZusatzangaben(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionEventPruefen method, of class SControler.
     */
    @Test
    public void testActionEventPruefen() {
        System.out.println("actionEventPruefen");
        SControler instance = new SControler();
        instance.actionEventPruefen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    
}
