/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg24.pkg10.pkg07ora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nidid
 */
public class MusicTest {
    
    public MusicTest() {
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
     * Test of getArtist method, of class Music.
     */
    @Test
    public void testGetArtist() {
        System.out.println("getArtist");
        Music instance = null;
        String expResult = "";
        String result = instance.getArtist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Music.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Music instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class Music.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Music instance = null;
        Integer expResult = null;
        Integer result = instance.getMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSec method, of class Music.
     */
    @Test
    public void testGetSec() {
        System.out.println("getSec");
        Music instance = null;
        Integer expResult = null;
        Integer result = instance.getSec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtist method, of class Music.
     */
    @Test
    public void testSetArtist() {
        System.out.println("setArtist");
        String artist = "";
        Music instance = null;
        instance.setArtist(artist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Music.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Music instance = null;
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMin method, of class Music.
     */
    @Test
    public void testSetMin() {
        System.out.println("setMin");
        Integer min = null;
        Music instance = null;
        instance.setMin(min);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSec method, of class Music.
     */
    @Test
    public void testSetSec() {
        System.out.println("setSec");
        Integer sec = null;
        Music instance = null;
        instance.setSec(sec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetails method, of class Music.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        Music instance = null;
        String expResult = "";
        String result = instance.getDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLengthInSec method, of class Music.
     */
    @Test
    public void testGetLengthInSec() {
        System.out.println("getLengthInSec");
        Music instance = null;
        Integer expResult = null;
        Integer result = instance.getLengthInSec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
