/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projektsortiranje.ProjektSortiranje;

/**
 *
 * @author Petra
 */
public class GlavniIzbornikTest {
    
    public GlavniIzbornikTest() {
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
     * Test of postaviSucelje method, of class GlavniIzbornik.
     */
    @Test
    public void testPostaviSucelje() {
        System.out.println("postaviSucelje");
        ProjektSortiranje novi = new ProjektSortiranje();
        GlavniIzbornik instance = new GlavniIzbornik(novi);
        instance.postaviSucelje();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of otvori method, of class GlavniIzbornik.
     */
    @Test
    public void testOtvori() {
        System.out.println("otvori");
        ProjektSortiranje novi = new ProjektSortiranje();
        GlavniIzbornik instance = new GlavniIzbornik(novi);
        instance.otvori();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
