/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektsortiranje;

import algoritmisortiranja.SortSucelje;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static projektsortiranje.PoljeSort.DEFAULT_PROZOR_SIRINA;
import static projektsortiranje.PoljeSort.DEFAULT_PROZOR_VISINA;

/**
 *
 * @author Petra
 */
public class PoljeSortTest {
    
    public PoljeSortTest() {
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
     * Test of velicinaPolja method, of class PoljeSort.
     */
    @Test
    public void testVelicinaPolja() {
        System.out.println("velicinaPolja");
        PoljeSort instance = new PoljeSort();
        int expResult = 0;
        int result = instance.velicinaPolja();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of vrijednost method, of class PoljeSort.
     */
    @Test
    public void testVrijednost() {
        System.out.println("vrijednost");
        int index = 0;
        PoljeSort instance = new PoljeSort();
        int expResult = 0;
        int result = instance.vrijednost(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of maxVrijednost method, of class PoljeSort.
     */
    @Test
    public void testMaxVrijednost() {
        System.out.println("maxVrijednost");
        PoljeSort instance = new PoljeSort();
        int expResult = 0;
        int result = instance.maxVrijednost();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class PoljeSort.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        int prviIndeks = 0;
        int drugiIndeks = 0;
        long milisekunde = 0L;
        boolean korak = false;
        PoljeSort instance = new PoljeSort();
        instance.swap(prviIndeks, drugiIndeks, milisekunde, korak);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateJednog method, of class PoljeSort.
     */
    @Test
    public void testUpdateJednog() {
        System.out.println("updateJednog");
        int indeks = 0;
        int vrijednost = 0;
        long milisekunde = 0L;
        boolean korak = false;
        PoljeSort instance = new PoljeSort();
        instance.updateJednog(indeks, vrijednost, milisekunde, korak);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mijesanje method, of class PoljeSort.
     */
    @Test
    public void testMijesanje() {
        System.out.println("mijesanje");
        PoljeSort instance = new PoljeSort();
        instance.mijesanje();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of istakniPolje method, of class PoljeSort.
     */
    @Test
    public void testIstakniPolje() {
        System.out.println("istakniPolje");
        PoljeSort instance = new PoljeSort();
        instance.istakniPolje();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPreferredSize method, of class PoljeSort.
     */
    @Test
    public void testGetPreferredSize() {
        System.out.println("getPreferredSize");
        PoljeSort instance = new PoljeSort();
        Dimension expResult = null;
        Dimension result = instance.getPreferredSize();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resetBoje method, of class PoljeSort.
     */
    @Test
    public void testResetBoje() {
        System.out.println("resetBoje");
        PoljeSort instance = new PoljeSort();
        instance.resetBoje();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class PoljeSort.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        PoljeSort instance = new PoljeSort();
        BufferedImage bi = new BufferedImage(DEFAULT_PROZOR_SIRINA, DEFAULT_PROZOR_VISINA, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bi.createGraphics();
        instance.paintComponent(g2);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class PoljeSort.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String imeAlgoritma = "";
        PoljeSort instance = new PoljeSort();
        instance.setName(imeAlgoritma);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlgorithm method, of class PoljeSort.
     */
    @Test
    public void testSetAlgorithm() {
        System.out.println("setAlgorithm");
        PoljeSort instance = new PoljeSort();
        SortSucelje algoritam = new SortSuceljeImpl();
        
        instance.setAlgorithm(algoritam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of odgodaAlgoritma method, of class PoljeSort.
     */
    @Test
    public void testOdgodaAlgoritma() {
        System.out.println("odgodaAlgoritma");
        PoljeSort instance = new PoljeSort();
        long expResult = 0L;
        long result = instance.odgodaAlgoritma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    private static class SortSuceljeImpl implements SortSucelje {

        public SortSuceljeImpl() {
        }

        private SortSuceljeImpl(PoljeSort instance) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getIme() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return null;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public long odgoda() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return 0;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void postaviOdgodu(long odgoda) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void pokreniSortiranje(PoljeSort polje) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
