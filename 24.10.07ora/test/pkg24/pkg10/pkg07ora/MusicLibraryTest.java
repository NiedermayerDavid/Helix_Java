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
public class MusicLibraryTest {
    
    public MusicLibraryTest() {
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
     * Test of addMusic method, of class MusicLibrary.
     */
    @Test
    public void testAddMusic() {
        System.out.println("addMusic");
        Music music = null;
        MusicLibrary instance = new MusicLibrary();
        boolean expResult = false;
        boolean result = instance.addMusic(music);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMusic method, of class MusicLibrary.
     */
    @Test
    public void testDeleteMusic() {
        System.out.println("deleteMusic");
        Music music = null;
        MusicLibrary instance = new MusicLibrary();
        boolean expResult = false;
        boolean result = instance.deleteMusic(music);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLibraryLength method, of class MusicLibrary.
     */
    @Test
    public void testGetLibraryLength() {
        System.out.println("getLibraryLength");
        MusicLibrary instance = new MusicLibrary();
        String expResult = "";
        String result = instance.getLibraryLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLibraryDetails method, of class MusicLibrary.
     */
    @Test
    public void testGetLibraryDetails() {
        System.out.println("getLibraryDetails");
        String expResult = "";
        String result = MusicLibrary.getLibraryDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilteredLibraDetails method, of class MusicLibrary.
     */
    @Test
    public void testGetFilteredLibraDetails() {
        System.out.println("getFilteredLibraDetails");
        String artist = "";
        String expResult = "";
        String result = MusicLibrary.getFilteredLibraDetails(artist);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
