/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import sample.EasyMaths;
import sample.EasyMaths;
/**
 *
 * @author eoinb837
 */
 public  class TestableEasyMaths extends EasyMaths
{ // I am going to test EasyMaths by testing TestableEasyMaths
   private boolean result; 
   public boolean equal(int[] array1, int[] array2) // we will override the equal method.
   {    // This is a fake equal method, as I don't want to call the real equal method. 
        // The compareArrays method calls the equal method. Its common for one method to call another. 
        // But I only want to test 1 unit (method) at a time. Testing a method calling another method would be 
        // an integration test, not a unit test. 
        // The idea with unit testing is to test each little component and make sure it is ok.  
        System.out.println("running fake equal method");
        return result;    
     }
   public void setResult( boolean theResult){
    result=theResult;  // This is configurable. I will configure it from the test code to make 'happy sounds'.
    }
   
}
