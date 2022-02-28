/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmisortiranja;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projektsortiranje.PoljeSort;

/**
 *
 * @author Petra
 */
public class SortSuceljeTest {
    
    public SortSuceljeTest() {
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
     * Test of getIme method, of class SortSucelje.
     */
    @Test
    public void testGetIme() {
        System.out.println("getIme");
        SortSucelje instance = new SortSuceljeImpl();
        String expResult = "";
        String result = instance.getIme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of odgoda method, of class SortSucelje.
     */
    @Test
    public void testOdgoda() {
        System.out.println("odgoda");
        SortSucelje instance = new SortSuceljeImpl();
        long expResult = 0L;
        long result = instance.odgoda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of postaviOdgodu method, of class SortSucelje.
     */
    @Test
    public void testPostaviOdgodu() {
        System.out.println("postaviOdgodu");
        long odgoda = 0L;
        SortSucelje instance = new SortSuceljeImpl();
        instance.postaviOdgodu(odgoda);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pokreniSortiranje method, of class SortSucelje.
     */
    @Test
    public void testPokreniSortiranje() {
        System.out.println("pokreniSortiranje");
        PoljeSort polje = null;
        SortSucelje instance = new SortSuceljeImpl();
        instance.pokreniSortiranje(polje);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class SortSuceljeImpl implements SortSucelje {

        public String getIme() {
            return "";
        }

        public long odgoda() {
            return 0L;
        }

        public void postaviOdgodu(long odgoda) {
        }

        public void pokreniSortiranje(PoljeSort polje) {
        }
    }
    
}
