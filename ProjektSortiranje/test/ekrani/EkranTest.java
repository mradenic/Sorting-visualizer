/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import java.awt.Dimension;
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
public class EkranTest {
    
    public EkranTest() {
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
     * Test of getPreferredSize method, of class Ekran.
     */
    @Test
    public void testGetPreferredSize() {
        System.out.println("getPreferredSize");
        ProjektSortiranje novi = new ProjektSortiranje();
        Ekran instance = new Ekran(novi) {
            @Override
            public void otvori() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Dimension expResult = null;
        Dimension result = instance.getPreferredSize();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of otvori method, of class Ekran.
     */
    @Test
    public void testOtvori() {
        System.out.println("otvori");
        ProjektSortiranje novi = new ProjektSortiranje();
        Ekran instance = new Ekran(novi) {
            @Override
            public void otvori() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        instance.otvori();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    private Ekran Ekran(ProjektSortiranje novi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class EkranImpl extends Ekran {

        public EkranImpl() {
            super(null);
        }

        public void otvori() {
        }
    }
    
}
