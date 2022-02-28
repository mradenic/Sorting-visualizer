/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektsortiranje;

import ekrani.Ekran;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Petra
 */
public class ProjektSortiranjeTest {
    
    public ProjektSortiranjeTest() {
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
     * Test of getTrenutniEkran method, of class ProjektSortiranje.
     */
    @Test
    public void testGetTrenutniEkran() {
        System.out.println("getTrenutniEkran");
        ProjektSortiranje instance = new ProjektSortiranje();
        Ekran expResult = null;
        Ekran result = instance.getTrenutniEkran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pushEkran method, of class ProjektSortiranje.
     */
    @Test
    public void testPushEkran() {
        System.out.println("pushEkran");
        ProjektSortiranje instance = new ProjektSortiranje();
        Ekran ekran = new Ekran(instance) {
            @Override
            public void otvori() {    
            }
        };
        
        instance.pushEkran(ekran);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of popEkran method, of class ProjektSortiranje.
     */
    @Test
    public void testPopEkran() {
        System.out.println("popEkran");
        ProjektSortiranje instance = new ProjektSortiranje();
        instance.popEkran();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class ProjektSortiranje.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        ProjektSortiranje instance = new ProjektSortiranje();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ProjektSortiranje.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ProjektSortiranje.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
