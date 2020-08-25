package edu.usfca.compound;

// Java arrays can be used as a static field, a local variable or a method parameter
// The size of an array must be specified by an int value and not long or short
// Direct superclass of an array type is Object
// Every array type implements the interfaces Cloneable and java.io.Serializable

// Array can contains primitives (int, char, etc) as well 
// as object (or non-primitives) references of a class

// In case of objects of a class, the actual objects are stored in heap segment.

// Syntax:
// type var-name[];
// OR
// type[] var-name;

import static java.lang.System.out;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray2;
        byte[] byteArray;
        short[] shortsArray;
        boolean[] booleanArray;
        long[] longArray;
        float[] floatArray;
        double[] doubleArray;
        char[] charArray;

        // an array of references to objects
        MyClass[] myClassArray; 
        Object[]  objectArr;       // array of Object
        // Collection[] a;
    }

    private class MyClass{

    }
}