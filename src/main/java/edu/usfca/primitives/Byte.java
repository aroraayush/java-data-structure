package edu.usfca.primitives;

// primitives aren't considered objects and represent raw values.
// They're stored directly on the stack
// All Java numeric types are signed, except char

public class Byte {
    
    // Default value is 0
    // 1 byte -> 8 bits -> -2^7 to 2^7– 1
    // Sum of bytes (a + b) returns int by default,
    // Additions have to be always typecasted

    // Byte data type is used to save space in large arrays,
    // mainly in place of integers, since a byte is four times smaller than an integer

    public static void main(String[] args) {

        byte a = 3;
        byte b = 8;
        byte result = (byte) (a + b);

        System.out.format("=============================\n");
        System.out.format("result 3 + 8 = %s\n", result);

        // Byte overflow
        // If the result is greater than 127 or less than
        // -128, then the byte variable overflows

        byte c = 124;
        byte d = 76;

        // 124 + 76 = 200. As we know, 200 cannot be stored in a single
        // byte, so the resulting variable will now store -56 instead of 200

        byte result2 = (byte) (c + d);
        
        System.out.format("result 124 + 76 = %s (byte overflow)\n", result2);
        // result 124 + 76 = -56 (byte overflow)
    }
}