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
public class ParalelnoSortiranjeTest {
    
    public ParalelnoSortiranjeTest() {
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
     * Test of compute method, of class ParalelnoSortiranje.
     */
    @Test
    public void testCompute() {
        System.out.println("compute");
        PoljeSort polje = new PoljeSort();
        int manji = 0;
        int veci = 0;
        long korakodgode = 0;
        
        ParalelnoSortiranje instance = new ParalelnoSortiranje(polje, manji, veci, korakodgode);
        instance.compute();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
