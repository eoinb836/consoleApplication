/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author eoinb837
 */
public  class EasyMaths {

    protected EasyMaths () {}

    /**
     * Checks whether the given integer arrays are equal.
     */
    public boolean equal(int[] array1, int[] array2) {
        System.out.println("running equal method");
        if ((array1 == null) || (array2 == null)) {
            throw new IllegalArgumentException("null argument");
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1 [i] != array2 [i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Scalar multiplication of given integer arrays.
     */
    public  int scalarMultiplication(int[]array1, int[]array2) {
        if ((array1 == null) || (array2 == null)) {
            throw new IllegalArgumentException("null argument");
        }

        if (array1.length != array2.length) {
            throw new IllegalArgumentException(
                    "different size arrays ("
                    + array1.length + ", " + array2.length + ')');
        }
    
    
        
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i] * array2[i];
        }
        return sum;
    }
public  String compareArrays(int array1[], int array2[]){
       int count = 0; String message = null;
       if ((array1 == null) || (array2 == null)) 
        {  throw new IllegalArgumentException("null argument");
     	}
        if (array1.length != array2.length) 
        {  throw new IllegalArgumentException("Different Length arrays");
        }
       if (equal(array1,array2))  // call the equal method no need to comapre if they are equal
            { count= array1.length ;
              message = "You have "+ count +" matching numbers.";
            }
       else
        {   String output = "";
            for (int j = 0; j < array1.length; j++)
            {
                for ( int k = 0; k < array1.length; k++)
                {
                    if (array1[j] == array2[k])
                    {   output += array2[k] + " ";
                        count++;
                    }
                }
            }
            message = "You have "+ count +" matching numbers.";
        }
       return message;
}
}

