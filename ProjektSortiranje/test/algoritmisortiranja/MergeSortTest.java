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
public class MergeSortTest {
    
    public MergeSortTest() {
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
     * Test of pokreniSortiranje method, of class MergeSort.
     */
    @Test
    public void testPokreniSortiranje() {
        System.out.println("pokreniSortiranje");
        PoljeSort polje = new PoljeSort();
        MergeSort instance = new MergeSort();
        instance.pokreniSortiranje(polje);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIme method, of class MergeSort.
     */
    @Test
    public void testGetIme() {
        System.out.println("getIme");
        MergeSort instance = new MergeSort();
        String expResult = "";
        String result = instance.getIme();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of odgoda method, of class MergeSort.
     */
    @Test
    public void testOdgoda() {
        System.out.println("odgoda");
        MergeSort instance = new MergeSort();
        long expResult = 0L;
        long result = instance.odgoda();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of postaviOdgodu method, of class MergeSort.
     */
    @Test
    public void testPostaviOdgodu() {
        System.out.println("postaviOdgodu");
        long delay = 0L;
        MergeSort instance = new MergeSort();
        instance.postaviOdgodu(delay);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
