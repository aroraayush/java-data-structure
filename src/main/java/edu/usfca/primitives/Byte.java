package edu.usfca.primitives;

public class Byte {
    public static void main(String[] args) {

        // primitives aren't considered objects and represent raw values.
        // They're stored directly on the stack
        // All Java numeric types are signed, except char

        // 1 byte -> 8 bits -> -2^7 to 2^7– 1
        byte a = 3;
        byte b = 8;

        // a + b returns int by default,
        // Additions have to be always typecasted

        byte result = (byte) (a + b);
        System.out.format("result %s\n", result);

        // Byte overflow
        // If the result is greater than 127 or less than
        // -128, then the byte variable overflows

        // 124 + 76 = 200. As we know, 200 cannot be stored in a single
        // byte, so the resulting variable will now store -56 instead of 200
        byte c = 124;
        byte d = 76;
        byte result2 = (byte) (c + d);
        System.out.format("result2 (byte overflow) %s\n", result2);
                                                        // result2 (byte overflow) -56
    }
}