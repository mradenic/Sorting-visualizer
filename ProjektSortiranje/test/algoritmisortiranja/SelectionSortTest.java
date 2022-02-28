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
public class SelectionSortTest {
    
    public SelectionSortTest() {
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
     * Test of pokreniSortiranje method, of class SelectionSort.
     */
    @Test
    public void testPokreniSortiranje() {
        System.out.println("pokreniSortiranje");
        PoljeSort polje = new PoljeSort();
        SelectionSort instance = new SelectionSort();
        instance.pokreniSortiranje(polje);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIme method, of class SelectionSort.
     */
    @Test
    public void testGetIme() {
        System.out.println("getIme");
        SelectionSort instance = new SelectionSort();
        String expResult = "";
        String result = instance.getIme();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of odgoda method, of class SelectionSort.
     */
    @Test
    public void testOdgoda() {
        System.out.println("odgoda");
        SelectionSort instance = new SelectionSort();
        long expResult = 0L;
        long result = instance.odgoda();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of postaviOdgodu method, of class SelectionSort.
     */
    @Test
    public void testPostaviOdgodu() {
        System.out.println("postaviOdgodu");
        long odgoda = 0L;
        SelectionSort instance = new SelectionSort();
        instance.postaviOdgodu(odgoda);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
