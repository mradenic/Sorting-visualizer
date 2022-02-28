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
public class QuickSortTest {
    
    public QuickSortTest() {
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
     * Test of pokreniSortiranje method, of class QuickSort.
     */
    @Test
    public void testPokreniSortiranje() {
        System.out.println("pokreniSortiranje");
        PoljeSort polje = new PoljeSort();
        QuickSort instance = new QuickSort();
        instance.pokreniSortiranje(polje);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIme method, of class QuickSort.
     */
    @Test
    public void testGetIme() {
        System.out.println("getIme");
        QuickSort instance = new QuickSort();
        String expResult = "";
        String result = instance.getIme();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of odgoda method, of class QuickSort.
     */
    @Test
    public void testOdgoda() {
        System.out.println("odgoda");
        QuickSort instance = new QuickSort();
        long expResult = 0L;
        long result = instance.odgoda();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of postaviOdgodu method, of class QuickSort.
     */
    @Test
    public void testPostaviOdgodu() {
        System.out.println("postaviOdgodu");
        long delay = 0L;
        QuickSort instance = new QuickSort();
        instance.postaviOdgodu(delay);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
