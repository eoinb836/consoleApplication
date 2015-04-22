/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import sample.EasyMaths;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eoinb837
 */
public class EasyMathsTest {
    
    public EasyMathsTest() {
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
     * Test of equal method, of class EasyMaths.
     */
    @Test (expected=IllegalArgumentException.class)
    public void Equal_2NullArrays_ExpectException() {
        System.out.println("equal");
        int[] array1 = null;
        int[] array2 = null;
        TestableEasyMaths myEasyMathsObj = new TestableEasyMaths();
        boolean result = myEasyMathsObj.equal(array1, array2);
 //       assertEquals(expResult, result); Don't needc an Assert as throws exception as soon as called
     
    }

    /**
     * Test of scalarMultiplication method, of class EasyMaths.
     */
    @Test
    public void compareArrays_ArraysHave0Match_You_have_0_Matching_nos() {
        System.out.println("compareArrays");
        int[] array1 = new int[] { 4, 42};
        int[] array2 = new int[] { 40, 43};
        TestableEasyMaths myEasyMathsObj = new TestableEasyMaths();
        assertEquals("You have 0 matching numbers.", myEasyMathsObj.compareArrays(array1, array2)); 
    }   
    
        @Test
    public void compareArrays_FakeEqualArraysHave0Match_You_have_0_Matching_nos() {
        System.out.println("compareArrays");
        int[] array1 = new int[] { 4, 42};
        int[] array2 = new int[] { 40, 43};
        TestableEasyMaths myFakeEasyMathsObj = new TestableEasyMaths();
        myFakeEasyMathsObj.setResult(false); // Goin to make the fake Equal method returns false ie 
// just get it to make happy noises for the test
        assertEquals("You have 0 matching numbers.", myFakeEasyMathsObj.compareArrays(array1, array2)); 
    }   

}
