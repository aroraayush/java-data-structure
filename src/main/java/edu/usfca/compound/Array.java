package edu.usfca.compound;

import java.util.Arrays;

// Java arrays can be used as a static field, a local variable or a method parameter
// The size of an array must be specified by an int value and not long or short
// Direct superclass of an array type is Object
// Every array type implements the interfaces Cloneable and java.io.Serializable

// Array can contains primitives (int, char, etc) as well as class object references
// Objects references are stored in heap segment

// Methods
// 1. Arrays.toString(arr))
// 2. Arrays.asList(arr))       : Used to convert primitive arrays to wrapper type

// 3. Arrays.fill(arr, value)   : Replace elments of array with specific value
//    Arrays.fill(arr, int from_Index, int to_Index, int val)

// 4. Arrays.stream(arr).forEach(i -> ...)

import static java.lang.System.out;

public class Array {
    public static void main(String[] args) {
        int[] intArray;
        byte[] byteArray;
        short[] shortsArray;
        boolean[] booleanArray;
        long[] longArray;
        float[] floatArray;
        double[] doubleArray;
        char[] charArray;

        // an array of references to objects
        MyClass[] myClassArray;     // Class defined below
        Object[]  objectArr;       // array of Object
        // Collection[] a;

        out.println("\n====== Array Initialized ======\n");
        
        intArray = new int[3];   // By default initialized with 0 - [0, 0, 0]
        out.println( Arrays.toString( intArray ) );

        
        
        out.println("\n====== Adding values with Arrays.fill() ======\n");
        
        Arrays.fill(intArray,2);        // [2, 2, 2]
        out.println(Arrays.toString(intArray));

        
        out.println("\n====== Printing values with stream ======");
        Arrays.stream(intArray).forEach(System.out::println);
    }

	private class MyClass { }
}