/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import algoritmisortiranja.SortSucelje;
import java.util.ArrayList;
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
public class VizualizatorTest {
    
    public VizualizatorTest() {
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
     * Test of otvori method, of class Vizualizator.
     */
    @Test
    public void testOtvori() {
        System.out.println("otvori");
        ArrayList<SortSucelje> novi = new ArrayList<>(); 
        ProjektSortiranje novi2 = new ProjektSortiranje();
        Vizualizator instance = new Vizualizator(novi, novi2);
        instance.otvori();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
