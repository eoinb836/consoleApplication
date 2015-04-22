/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import sample.UtilityClass;
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
public class UtilityClassTest {
    
    public UtilityClassTest() {
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
     * Test of concatWords method, of class UtilityClass.
     */
    
    @Test
  public void concatWords_inputStringsHelloWorld_OutputsOneString() {
        System.out.println("concatWords");
        UtilityClass myUtilityObj = new UtilityClass();
        String result = myUtilityObj.concatWords("Hello", ", ", "world", "!");
        String expResult = "Hello, world!";
         assertEquals(expResult, result);
    }

@Test
        public void computeFactorial_Factorial5_Is120(){
          System.out.println("ComputeFactorial 5");
          UtilityClass myUtilityObj = new UtilityClass();
        assertEquals("120",myUtilityObj.computeFactorial(5));
    }

//@Test(timeout=1000)
//    public void computeFactorial_ComputesFactorialOfRandomNo_CalculatesFactorialOrTimesOut() {     
//
//    System.out.println("ComputeFactorial with time out");
//    final int factorialOf = 1 + (int) (30000 * Math.random());
//    System.out.println("computing " + factorialOf + '!'+ " =" );
//    System.out.println(UtilityClass.computeFactorial(factorialOf));
//    }

    
      @Test (expected=IllegalArgumentException.class)
            public void computeFactorial_FactorialNegative5_ThrowsException() {
            System.out.println("computeFactorial of -5");
            final int factorialOf = -5;
             UtilityClass myUtilityObj = new UtilityClass();
        System.out.println(factorialOf + "! = " + myUtilityObj.computeFactorial(factorialOf));
}

    /**
     * Test of computeFactorial method, of class UtilityClass.
     */
  
    
}

